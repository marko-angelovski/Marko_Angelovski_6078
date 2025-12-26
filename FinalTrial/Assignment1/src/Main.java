import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        List<SFBook> sfBooks = new ArrayList<>();
        List <AdventureBook> adventureBooks= new ArrayList<>();
        String title;
        String author;
        double price;
        String language;
        int publishYear;
        boolean bestSeller;
        boolean childrenBook;
        while (true){
            System.out.println("1. Input SF book");
            System.out.println("2. Input Adventure book");
            System.out.println("3. List all books");
            System.out.println("4. List the oldest book");
            System.out.println("5. List the most expensive book");
            System.out.println("6. List the average price of all books");
            System.out.println("7. Exit the program");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.println("Enter Author: ");
                    author = scanner.nextLine();
                    System.out.println("Enter Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Language: ");
                    language= scanner.nextLine();
                    System.out.println("Enter Publishing Year: ");
                    publishYear = scanner.nextInt();
                    System.out.println("Is the book a bestseller? ");
                    bestSeller = scanner.nextBoolean();
                    scanner.nextLine();
                    sfBooks.add(new SFBook(title,author,price,language,publishYear,bestSeller));
                    break;
                case 2:
                    System.out.println("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.println("Enter Author: ");
                    author = scanner.nextLine();
                    System.out.println("Enter Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Language: ");
                    language= scanner.nextLine();
                    System.out.println("Enter Publishing Year: ");
                    publishYear = scanner.nextInt();
                    System.out.println("Is it a children's book: ");
                    childrenBook = scanner.nextBoolean();
                    adventureBooks.add(new AdventureBook(title,author,price,language,publishYear,childrenBook));
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Here are all of the books: ");
                    sfBooks.forEach(b-> b.printAttributes());
                    adventureBooks.forEach(b->b.printAttributes());
                    break;
                case 4:
                    System.out.println("The oldest book is: ");
                    Book oldest = null;
                    int minYear = Integer.MAX_VALUE;
                    for (SFBook sfBook:sfBooks){
                        if(sfBook.getPublishYear()<minYear){
                            oldest = sfBook;
                            minYear = sfBook.getPublishYear();
                        }


                    }
                    for(AdventureBook adventureBook:adventureBooks){
                        if(adventureBook.getPublishYear()<minYear){
                            oldest = adventureBook;
                            minYear = adventureBook.getPublishYear();

                        }
                    }
                    if(oldest!=null){
                        oldest.printAttributes();


                    }else{
                        System.out.println("No books avaliable!");
                    }
                    break;
                case 5:
                    List<Book> allBooks = new ArrayList<>();
                    allBooks.addAll(sfBooks);
                    allBooks.addAll(adventureBooks);

                    allBooks.stream().min(Comparator.comparingDouble(Book::getPrice)).ifPresentOrElse(cheapest-> {
                        System.out.println("The cheapest book is: ");
                        cheapest.printAttributes();
                    }, ()-> System.out.println("No books found. "));
                    break;
                case 6:
                    double total = 0;
                    double size = 0;
                    for (SFBook sfBook:sfBooks) {
                        total+=sfBook.getPrice();
                        size+=1;
                    }
                    for(AdventureBook adventureBook:adventureBooks){
                     total+=adventureBook.getPrice();
                     size+=1;
                    }

                    if (size>0){
                        double avg = total/size;
                        System.out.println("The average is: " + avg);

                    }else{
                        System.out.println("No books available!");
                    }
                    break;

                case 7:
                    System.out.println("GoodBye!");
                    return;


            }

        }
    }
}
