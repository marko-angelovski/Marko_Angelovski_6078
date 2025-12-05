import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String name = "";
    int year = 0;
    double height = 0;
    int weight = 0;
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    try {
        System.out.println("What is your name? ");
        name = bufferedReader.readLine();
        System.out.println("What is your year of birth?");
        year = Integer.parseInt(bufferedReader.readLine());
        System.out.println("What is your height?");
        height = Double.parseDouble(bufferedReader.readLine());
        System.out.println("What is your weight?");
        weight = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + year);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("You turn: " + (2025-year));
        System.out.println("BMI: " + weight/(height*height));


    }catch (IOException e){
        e.printStackTrace();

    }catch (NumberFormatException e){
        System.out.println("Invalid Input");
    }
}
