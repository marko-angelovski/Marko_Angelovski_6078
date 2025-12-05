import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int columns;
    int rows;
    int[][] matrix;

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    try{
        System.out.println("Enter the number of rows: ");
        rows = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the number of columns: ");
        columns = Integer.parseInt(bufferedReader.readLine());
        matrix = new int[rows][columns];
        int sum = 0;
        System.out.println("Enter elements: ");
        for (int i = 0; i<rows; i++){
            for(int j = 0; j < columns;j++){
                matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
                sum+=matrix[i][j];

            }
        }


        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + (double)sum/(rows+columns));

    } catch (IOException e) {
        throw new RuntimeException(e);
    }catch (NumberFormatException e){
        System.out.println("Invalid Input");
    }
}
