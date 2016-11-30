class CirculatingBook extends LibraryBook {
    private String currentHolder;
    private String dueDate;

    public CirculatingBook() {
	super();
    }
    
    public CirculatingBook(String auth, String titl, String isbn, String num) {
	this.setAuthor(auth);
	this.setTitle(titl);
	this.setISBN(isbn);
	this.setCallNumber(num);
	currentHolder = null;
	dueDate = null;
    }

    public String getCurrentHolder() {
	return currentHolder;
    }

    public String getDueDate() {
	return dueDate;
    }

    public void setCurrentHolder(String newCH) {
	currentHolder = newCH;
    }

    public void setDueDate(String newDueDate) {
	dueDate = newDueDate;
    }

    public void checkout(String patron, String due) {
	currentHolder = patron;
	dueDate = due;
    }

    public void returned() {
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	if ( this.getCurrentHolder() == null ) {
	    return "book available on shelves";
	}
	else {
	    return
		"Current Holder: " + getCurrentHolder() +
		"Due Date: " + getDueDate();
	}
    }

    public String toString() {
	return
	    getTitle() + ", " +
	    getAuthor() + ", " +
	    getISBN() + ", " +
	    getCallNumber() + ", " +
	    circulationStatus() + ", " +
	    getCurrentHolder() + ", " +
	    getDueDate();
    }

    public static void main(String[] args) {
	
    }
}
