public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook() {
	super();
    }
    
    public ReferenceBook(String auth, String titl, String num, String callnum, String collectio) {
        this.setAuthor(auth);
	this.setTitle(titl);
	this.setISBN(num);
	this.setCallNumber(callnum);
	collection = collectio;
    }

    public String getCollection() {
	return collection;
    }

    public void setCollection(String newCollection) {
	collection = newCollection;
    }

    public void checkout(String patron, String due) {
	System.out.println("cannot check out a reference book");
    }

    public void returned() {
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus() {
	return "non-circulating reference book";
    }

    public String toString() {
	return
	    getTitle() + ", " +
	    getAuthor() + ", " +
	    getISBN() + ", " +
	    circulationStatus() + ", " +
	    getCallNumber() + "," +
	    getCollection();
    }

    public static void main(String[] args) {
        //ReferenceBook a = new ReferenceBook();
	//System.out.println(a);
    }

}
