public class Movie extends  Media{
    protected double duration;

    public Movie(String creator, String title, double duration) {
        super(creator, title);
        this.duration = duration;
    }
    public void watchTrailer(){
        System.out.println("Trailer is available to watch! ");
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
        System.out.println("Duration: " + duration);
    }
}
