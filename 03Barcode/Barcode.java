public class Barcode implements Comparable<Barcode> {
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	if ( zip.length() != 5 ) {
	    throw new IllegalArgumentException("Incorrect zip code length!");
	}
	for ( int i = 0; i < 5; i++ ) {
	    if ( !( Character.isDigit(zip.charAt(i)) ) ) {
		throw new IllegalArgumentException("Numerical values only!");
	    }
	}
	
	_zip = zip;
	_checkDigit = checkSum(_zip);
    }

    private int checkSum(String num) {
	int sum = 0;
	for ( int i = 0; i < 5; i++ ) {
	    sum += (int) num.charAt(i);
	}
	return sum % 10;
    }

    public int compareTo(Barcode other) {
	return this.compareTo(other);
    }

    public String toString() {
	String ans = "";
	ans += _zip + _checkDigit + " |";
	
	for ( int i = 0; i < 6; i++ ) {
	    String bc = _zip + _checkDigit;
	    int digit = bc.charAt(i);

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
	return ans + "|";
    }
}
