public class Barcode implements Comparable<Barcode> {
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	if ( zip.length() != 5 ) {
	    throw new IllegalArgumentException("Incorrect zip code length");
	}
	_zip = zip;
	_checkDigits = checkSum(_zip);
    }

    private int checkSum() {
	int sum = 0;
	for ( int i = 0; i < 6; i++ ) {
	    sum += (int) _zip.charAt(i);
	}
	return sum % 10;
    }

}
