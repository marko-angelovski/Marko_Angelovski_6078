import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        while (count <10){
            int num = random.nextInt(500);
            System.out.println("Number: "+num);
            count++;
        }
        int num;

        do{
            num = random.nextInt(500);
            System.out.println("Number: "+num);

        } while(num<300);
        int counter = 0;
        for (int i = 0; i < 20; i++){
            num = random.nextInt(500);
            System.out.println("Number: " + num);
            if(num%2 == 0){
                counter++;
            }
            if(num%7==0){
                break;
            }
        }


    }
}