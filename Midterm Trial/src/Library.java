import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);

    }

    void displayAllBooks() {
        for (Book book : books) {
            System.out.println("Book: ");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println();
        }
    }

    void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Book by " + author + ": ");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Price: " + book.getPrice());
                System.out.println();

            }
        }

    }

    void sortBookByPrice() {
        int n = books.size();
        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).getPrice() > books.get(j + 1).getPrice()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }

            }
        }
    }
    void displayBooks(){
        for (Book book: books){
            System.out.println("Book: ");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println();
        }

    }


}
