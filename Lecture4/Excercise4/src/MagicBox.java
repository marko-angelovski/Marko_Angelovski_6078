import java.util.Random;

public class MagicBox {

    private int[] arr= new int[10];
    public MagicBox(){
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt(100)+1;

        }

    }
    public int findEvens(){
        int counter = 0;
        for (int elem:arr){
            if (elem%2==0){
                counter++;
            }
        }
        return counter;
    }
    public double calculateAverage(){
        int sum = 0;
        for(int elem:arr){
            sum+=elem;


        }
        double average = (double)sum/10.0;
        return average;
    }
    public void printMagicBox(){
        System.out.println("Array: ");
        for (int elem: arr){
            System.out.print(elem+", ");
        }
        System.out.println();
    }


}
