import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter some year or STOP to exit!");
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                System.out.println("Exiting the time traveller challenge");
                break;
            }
            try {
            year = Integer.parseInt(input);
            if (isLeap(year)) {
                System.out.println("It is a leap year!");
            } else {
                System.out.println("Not a leap year!");
            }
        }catch (Exception e){
                System.out.println("Invalid Input!");

        }

        }
    }

    public static boolean isLeap(int year){
        if(year%4 != 0){
            return false;
        }else if(year%100 !=0){
            return true;

        }else if(year%400 ==0){
            return true;
        }else{
            return true;
        }
    }
}