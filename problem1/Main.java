package problem1;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(100);
        Librarian librarian = new Librarian(bookShelf);

        librarian.addBook(new Book("Books abc 1", 20));
        librarian.addBook(new Book("Books efg 2", 30));
        librarian.addBook(new Book("Books hij 3", 40));

        bookShelf.display();

        Book foundBook = librarian.findBook("Book 2");
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}
