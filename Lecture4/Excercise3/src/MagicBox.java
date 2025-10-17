import java.util.Random;

public class MagicBox {
    private int[] randomNumbs;

    public MagicBox() {
        randomNumbs = new int[10];
        Random random = new Random();
        for(int i = 0; i < randomNumbs.length; i++){
            randomNumbs[i] = random.nextInt(100)+1;

        }
    }
    public int findEvens(){
        int counter = 0;
        for(int k: randomNumbs){
            if(k%2==0){
                counter++;


            }
        }
        return counter;
    }
    public double calculateAVG(){
        double avg = 0;
        int sum = 0;
        for (int number: randomNumbs){
            sum+=number;
        }
        avg = (double)sum/randomNumbs.length;
        return avg;

    }
    public void print(){
        for(int k: randomNumbs){
            System.out.print(k+", ");
            System.out.println();
        }
    }
}
