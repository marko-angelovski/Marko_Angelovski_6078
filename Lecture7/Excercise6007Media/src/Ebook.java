public class Ebook implements MediaItem,Readable,Downloadable{

    String title;
    String creator;
    double fileSize;
    int numberOfPages;

    public Ebook(String creator, String title,double fileSize, int numberOfPages) {
        this.creator = creator;
        this.title = title;
        this.fileSize = fileSize;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void download() {
        System.out.println("Downloading file of size " + fileSize + "MB");

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void open() {
        System.out.println("Opening Ebook");

    }

    @Override
    public void readPage(int page) {
        if (page>=1 && page<=numberOfPages){
            System.out.println("Reading page " + page);

        }
        else{
            System.out.println("Invalid number of pages!");
        }


    }

    @Override
    public void close() {

    }
}
