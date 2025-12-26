public class AdventureBook extends Book{
    private int publishYear;
    private boolean childrenBook;

    public AdventureBook(String title, String author, double price, String language, int publishYear, boolean childrenBook) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.childrenBook = childrenBook;
    }
    public AdventureBook(){}

    public AdventureBook(int publishYear, boolean childrenBook) {
        this.publishYear = publishYear;
        this.childrenBook = childrenBook;
    }

    @Override
    protected void printAttributes() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + this.price);
        System.out.println("Language: " + language);
        System.out.println("Publishing Year: " + publishYear);
        System.out.println("Children Book: " + childrenBook);

    }

    @Override
    protected double getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
