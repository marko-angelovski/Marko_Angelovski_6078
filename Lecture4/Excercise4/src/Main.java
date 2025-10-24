//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.printMagicBox();
        System.out.println("Evens: " + magicBox.findEvens());
        System.out.println("Average: "+magicBox.calculateAverage());

    }
}