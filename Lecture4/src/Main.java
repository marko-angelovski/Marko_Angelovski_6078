// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(100,50);
        hero.printStatus();
        hero.takeDamage(30);
        hero.powerUp(50);
        hero.printStatus();

    }
}
