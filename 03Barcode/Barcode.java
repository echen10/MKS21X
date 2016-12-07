public class Barcode implements Comparable<Barcode> {
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	if ( zip.length() != 5 ) {
	    throw new runtimeException("Incorrect zip code length");
	}
	_zip = zip;
	_checkDigits = ( ) % 10;
    }
