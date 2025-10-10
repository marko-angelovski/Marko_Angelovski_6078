import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] A = new int[15];
        Random random = new Random();
        for(int i = 0; i  <15; i++){
            A[i] = random.nextInt(100)+1;

        }
        int count = 0;

        for (int elem :A){
            System.out.print(elem + ", ");
            if (elem%3 == 0){
                count++;
            }
        }
        System.out.println();

        System.out.println("There are " + count + " divisible by 3!");
        int[] B = new int[A.length];

        for (int i =0; i< A.length; i++){
            B[i] = 100-A[i];

        }


        for (int elem :B){
            System.out.print(elem + ", ");
        }
        System.out.println();





    }
}