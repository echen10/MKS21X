public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book() {
	author = null;
	title = null;
	ISBN = null;
    }

    public Book(String auth, String titl, String num) {
	author = auth;
	title = titl;
	ISBN = num;
    }

    public String getAuthor() {
	return author;
    }

    public String getTitle() {
	return title;
    }

    public String getISBN() {
	return ISBN;
    }

    public void setAuthor(String newAuthor) {
	author = newAuthor;
    }

    public void setTitle(String newTitle) {
	title = newTitle;
    }

    public void setISBN(String newISBN) {
	ISBN = newISBN;
    }

    public String toString() {
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }


    public static void main(String[] args) {
	//Book b = new Book("a","b","c");
	//System.out.println(b.getAuthor());
    }
}
