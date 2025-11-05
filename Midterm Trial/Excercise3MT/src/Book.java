public class Book extends Media{
    protected int numPages;
    void readSample(){
        System.out.println("Avaliable to read!");
    }

    public Book(String creator, String title, int numPages) {
        super(creator, title);
        this.numPages = numPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
        System.out.println("Number of Pages: "+ numPages);

    }
}
