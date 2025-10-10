import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = random.nextInt(10)+1;
        int y = random.nextInt(10)+1;
        int gx;
        int gy;
        for (int i = 0; i < 5; i++){
            System.out.println("Guess the coordinates of the treasure: ");
            System.out.println("X = ");
            gx = scanner.nextInt();
            System.out.println("y = ");
            gy = scanner.nextInt();

            if(gx == x && gy == y){
                System.out.println("Correct Guess!");
                return;
            }

        }


    }
}