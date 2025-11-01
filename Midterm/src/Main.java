import java.util.Scanner;

class App{
    public static void main(String[] args){
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String author;
        String title;
        double price;
        for (int i = 0; i < 3; i++){
            System.out.println("Book " + i+1+ ": ");
            System.out.println("Title: " );
            title = scanner.nextLine();
            System.out.println("Author: ");
            author = scanner.nextLine();
            System.out.println("Price: ");
            price = scanner.nextDouble();
            scanner.nextLine();
            library.addBook(new Book(title,author,price));


        }
        System.out.println("Enter name of author: ");
        author = scanner.nextLine();
        library.findBooksByAuthor(author);
        library.sortBookByPrice();
        library.displayAllBooks();

    }

}
