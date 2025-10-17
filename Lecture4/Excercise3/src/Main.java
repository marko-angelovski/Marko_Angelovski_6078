// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.print();
        System.out.println("Evens: "+magicBox.findEvens());
        System.out.println("Average: " + magicBox.calculateAVG());
    }
}