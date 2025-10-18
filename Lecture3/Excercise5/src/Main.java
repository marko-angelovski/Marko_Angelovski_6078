import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] map = new int[5][10];
        int [] rowSums = new int [5];
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            for (int j =0; j < 10; j++){
                map[i][j] = random.nextInt(0,10);
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j =0; j < 10; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++){
            int sum = 0;

            for (int j =0; j < 10; j++){
                sum+=map[i][j];
            }
            rowSums[i] = sum;
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.print(rowSums[i] + ", ");
        }
        System.out.println();
    }
}