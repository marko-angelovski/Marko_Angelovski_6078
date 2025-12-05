import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String input;
    try {
        while (true) {
            System.out.println("Input some string or 'exit' to end: ");
            input = bufferedReader.readLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            int weight = 0;
            System.out.println("The length of " + input+ " is: " + input.length());
            System.out.println("The weight of " + input+ " is: " + weight);

            for(int i = 0; i < input.length();i++){
                weight+=input.charAt(i);
            }

        }
    }catch (IOException e){
        System.out.println("Enter a string!");
    }


}
