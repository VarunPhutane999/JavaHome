package src.problem1;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();
    private int maxSize;

    public BookShelf(int initialSpace) {
        this.maxSize = initialSpace;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void display() {
        System.out.println("--- Bookshelf ---");
        for (Book book : books) {
            System.out.println(book.getTitle() + "(" + book.getSize() + ")");
        }
    }
    public int space() {
        int totalSize = 0;
        for (Book book : books) {
            totalSize += book.getSize();
        }
        return maxSize - totalSize;
    }
    
}
