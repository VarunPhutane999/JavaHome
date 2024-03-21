package problem1;

public class Librarian {
    private BookShelf bookShelf;

    public Librarian(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void addBook(Book book) {
        if (bookShelf.space() >= book.getSize()) {
            bookShelf.getBooks().add(book);
            System.out.println(book.getTitle() + "(" + book.getSize() + ") is added.");
        } else {
            System.out.println(book.getTitle() + "(" + book.getSize() + ") is too large.");
        }
    }

    public Book findBook(String title) {
        for (Book book : bookShelf.getBooks()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    
}
