public abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    protected String language;
    protected abstract void printAttributes();
    protected abstract double getPrice();


    public Book(String title, String author, double price, String language) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.language = language;
    }
    public Book(){

    }
}
