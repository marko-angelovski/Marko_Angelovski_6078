public  abstract class Media {
    protected String title;
    protected String creator;

    public Media(String creator, String title) {
        this.creator = creator;
        this.title = title;
    }

    public abstract void displayInfo();

}
