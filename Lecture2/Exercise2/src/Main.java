import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        int length = name.length();
        System.out.println("The length of the name is: " + length);
        char middleCharacter;

        if(length%2==0){
            middleCharacter = name.charAt(length/2-1);
        }else{
            middleCharacter = name.charAt(length/2);
        }

        System.out.println("The middle character is " + middleCharacter);



    }
}