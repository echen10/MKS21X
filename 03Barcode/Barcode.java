public class Barcode implements Comparable<Barcode> {
    private String zip;

    public Barcode(String num) {
	zip = num;
	if ( zip.length() != 5 ) {
	    throw new IllegalArgumentException("Incorrect zip code length!");
	}
	for ( int i = 0; i < 5; i++ ) {
	    if ( !( Character.isDigit(num.charAt(i)) ) ) {
		throw new IllegalArgumentException("Numerical values only!");
	    }
	}
    }

    private static int checkSum(String num) {
	int sum = 0;
	for ( int i = 0; i < 5; i++ ) {
	    sum += (int) num.charAt(i);
	}
	return sum % 10;
    }

    public int compareTo(Barcode other) {
	return this.compareTo(other);
    }

    public static String toBarcode(String zip) {
	String ans = "|";
	for ( int i = 0; i < 6; i++ ) {
	    String bc = zip + checkSum(zip);
	    char digit = bc.charAt(i);

	    switch( digit ) {
		
	    case '1' : ans += ":::||";
		break;
	    case '2' : ans += "::|:|";
		break;
	    case '3' : ans += "::||:";
		break;
	    case '4' : ans += ":|::|";
		break;
	    case '5' : ans += ":|:|:";
		break;
	    case '6' : ans += ":||::";
		break;
	    case '7' : ans += "|:::|";
		break;
	    case '8' : ans += "|::|:";
		break;
	    case '9' : ans += "|:|::";
		break;
	    case '0' : ans += "||:::";
		break;
	    }
	}
	return ans += "|";
    }

    public static String toZip(String code) {
	if ( code.length() != 32 ) {
	    throw new IllegalArgumentException("Invalid length!");
	}
	
	for ( int i = 0; i < 5; i++ ) {
	    if ( !( code.charAt(i) == '|' || code.charAt(i) == ':' ) ) {
		throw new IllegalArgumentException("Invalid characters!");
	    }
	}
	
	if ( code.charAt(0) != '|' || code.charAt(31) != '|' ) {
	    throw new IllegalArgumentException("Missing guard rails!");
	}

	for ( int i = 1; i < 26; i += 5 ) {
	    String bars = code.substring(i, i+5);
	    System.out.println(bars);
	    if ( ( bars ==  ":::||" ||
		    bars ==  "::|:|" ||
		    bars ==  "::||:" ||
		    bars ==  ":|::|" ||
		    bars ==  ":|:|:" ||
		    bars ==  ":||::" ||
		    bars ==  "|:::|" ||
		    bars ==  "|::|:" ||
		    bars ==  "|:|::" ||
		    bars ==  "||:::" ) ){
		     
		     throw new IllegalArgumentException("Barcode mismatch!");
	    }
	}
	
	//if (  ) {
	//    throw new IllegalArgumentException("Invalid checkSum!");
	//}

	String ans = "";
	for ( int i = 1; i < 26; i += 5 ) {
	    String bars = code.substring(i, i+5);
	    
	    switch( bars ) {
	    case ":::||" : ans += "1";
		break;
	    case "::|:|" : ans += "2";
		break;
	    case "::||:" : ans += "3";
		break;
	    case ":|::|" : ans += "4";
		break;
	    case ":|:|:" : ans += "5";
		break;
	    case ":||::" : ans += "6";
		break;
	    case "|:::|" : ans += "7";
		break;
	    case "|::|:" : ans += "8";
		break;
	    case "|:|::" : ans += "9";
		break;
	    case "||:::" : ans += "0";
		break;
	    }
	}
	return ans;
    }
    

    public String toString() {
        return zip + checkSum(zip) + " " +  toBarcode(zip);
    }
}
