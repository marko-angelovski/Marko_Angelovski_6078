import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][]matrix = new char[3][3];
        generateMatrix(matrix);
        printMatrix(matrix);
        int countx = countLines(matrix,'X');
        int count0 = countLines(matrix,'O');
        announceWinner(countx,count0);

    }

    public static void generateMatrix(char[][] matrix){
        Random random = new Random();
        for(int i = 0 ; i<3; i++){
            for (int j =0;j<3;j++){
                matrix[i][j] = random.nextBoolean()?'X':'O';
            }
        }
    }
    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static  int countLines(char[][] matrix, char symbol){
        int count = 0;
        for (int i = 0; i < 3; i++){
            if(matrix[i][0] == symbol&&matrix[i][1] == symbol&&matrix[i][2] == symbol){
                count++;

            }
        }
        for (int j = 0; j < 3; j++){
            if(matrix[0][j] == symbol&&matrix[1][j] == symbol&&matrix[2][j] == symbol){
                count++;

            }
        }
        if(matrix[0][0] == symbol&& matrix[1][1] == symbol&&matrix[2][2] == symbol){
            count++;

        }
        if(matrix[2][0] == symbol&& matrix[1][1] == symbol&&matrix[0][2] == symbol){
            count++;

        }


        return count;
    }

    public static void announceWinner(int countx,int count0){
        if (countx>count0){
            System.out.println("X is the winner");
        }else if(countx<count0){
            System.out.println("O is the winner");
        }else{
            System.out.println("No winner");
        }

    }

}


