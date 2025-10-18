import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr;
        int[] complement;
        int divisor = 3;
        int size = 15;
        arr = new int[size];
        complement = new int[size];

        generateArray(arr,size);
        for (int elem: arr){
            System.out.print(elem+", ");
        }
        System.out.println();
        System.out.println("Divisible by " + divisor + ": " + divisibleBy(arr,divisor));
        complement(arr,complement);
        System.out.println("Complement: ");
        for (int elem: complement){
            System.out.print(elem+", ");
        }



    }

    public  static void generateArray(int[] arr,int size){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(101);

        }
    }
    public static int divisibleBy(int[] arr, int divisor){
        int divisible = 0;
        for(int elem:arr){
            if(elem%divisor == 0){
                divisible +=1;
            }
        }
        return divisible;

    }


    public static void complement(int[] arr, int[] complement){
        for(int i = 0; i < arr.length; i++){
            complement[i] = 100-arr[i];

        }


    }



}


