import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        Scanner scanner = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        for (int i = 0; i < 3; i++){
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            System.out.println("Enter price: ");
            price = scanner.nextDouble();
            System.out.println("Enter quantity: ");
            quantity = scanner.nextInt();
            products[i] = new Product(name,price,quantity);
            scanner.nextLine();

        }
        for (Product product:products){
            product.display();
        }

        int product;
        int amount;
        System.out.println("Enter index of product to restock: ");
        product = scanner.nextInt();
        System.out.println("Enter amount to restock: ");
        amount = scanner.nextInt();
        products[product].increaseQuantity(amount);
        System.out.println("After restock: ");
        products[product].display();


    }
}