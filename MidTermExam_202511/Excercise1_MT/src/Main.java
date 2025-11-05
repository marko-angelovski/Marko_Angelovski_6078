import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n;
        System.out.println("Please enter the number of Fibonacci numbers you want: ");
        n = scanner.nextInt();
        fibonacciSequence(n);




    }
    static void fibonacciSequence(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + ", ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

}
