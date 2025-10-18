import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        int [] b = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++){
            arr[i] = random.nextInt(101);

        }
        for (int i = 0; i < 15; i++){
            b[i] = 100-arr[i];
            if(arr[i]%2==0){
                count++;
            }

        }
        System.out.println("The complement array is: ");
        for (int i = 0; i < 15; i++){
            System.out.print(b[i]+", ");

        }
        System.out.println();
        System.out.println("Number of even numbers is " + count);
    }
}