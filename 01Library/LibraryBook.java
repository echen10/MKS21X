abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook(String auth, String titl, String num, String callnum) {
	author = auth;
	title = titl;
	ISBN = num;
	callNumber = callnum;
    }

    public String getCallNumber() {
	return callNumber;
    }
    
    public void setCallNumber(String newCallNum) {
	callNumber = newCallNum;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    
    public int compareTo(LibraryBook o) {
	return getCallNumber() - o.getCallNumber();
    }

    public String toString() {
	return
	    getTitle() + ", " +
	    getAuthor() + ", " +
	    getISBN() + ", " +
	    circulationStatus() + ", " +
	    getCallNumber();
    }

}
