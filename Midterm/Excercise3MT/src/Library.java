public class Library {
    static public void displayAllMedia(Media[] media){
        for(Media m: media){
            m.displayInfo();
            if(m instanceof Book){
                ((Book) m).readSample();

            }
            if(m instanceof Movie){
                ((Movie) m).watchTrailer();
            }
        }
    }
}
