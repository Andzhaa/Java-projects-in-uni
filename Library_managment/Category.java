package Library_managment;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;

    public String getName() {
        return name;
    }

    private List<Book> books;

    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        System.out.println("=========================");
        System.out.println("" + name + " Books:");
        System.out.println("=========================");
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
        
        
    }

    public boolean deleteBook(String title) {
        for (Book book : books) {
            if (book.getDetails().get("Title").equals(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
