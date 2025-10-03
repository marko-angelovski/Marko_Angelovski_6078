import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(101);
        System.out.println("The number generated was " + score);
        if(score < 60){
            System.out.println("You have failed!");
        }else{
            System.out.println("You have passed!");
        }
    }
}