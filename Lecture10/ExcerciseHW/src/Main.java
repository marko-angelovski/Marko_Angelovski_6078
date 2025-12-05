import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    List<Book> books = new ArrayList<>();
    books.add(new Book("ATitle","AuthorA", 4284,400));
    books.add(new Book("BOOK1", "AUTHORA", 49.99, 150));
    books.add(new Book("BOOK2", "AUTHORB", 29.99, 87));
    books.add(new Book("BOOK4", "AUTHORD", 59.95, 2000));
    books.add(new Book("BOOK5", "AUTHORE", 39.75, 45));
    books.add(new Book("BOOK3", "AUTHORC", 79.50, 1200));
    books = books.stream().sorted(Comparator.comparing(book->book.getTitle())).collect(Collectors.toList());
    books.forEach(book->book.printAttribute());

    Book minPrice = books.stream().min(Comparator.comparingDouble(book->book.getPrice())).orElse(null);
    System.out.println();
    minPrice.printAttribute();
    System.out.println("Cheapest book: ");
    books.stream().min(Comparator.comparingDouble(book->book.getPrice())).ifPresent(book -> book.printAttribute());
    books.stream().max(Comparator.comparingDouble(book->book.getPrice())).ifPresent(book -> {
        System.out.println("Most expensive book: ");

        book.printAttribute();
    });

    System.out.println("Is there a book with a qiantity grater than 1000? "+ books.stream().anyMatch(book -> book.getQuantity()>1000));
    System.out.println("That book is: ");
   books.stream().filter(book -> book.getQuantity()>1000).forEach(book->book.printAttribute());


}

