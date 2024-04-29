package Library_managment;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Category> categories;

    public Library() {
        categories = new ArrayList<>();
        categories.add(new Category("Science"));
        categories.add(new Category("Technology"));
        categories.add(new Category("Novels"));
    }

    public void addBook(String categoryName, Book book) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                category.addBook(book);
                System.out.println("Book added successfully to " + categoryName + " category.");
                return;
            }
        }
        System.out.println("Category not found.");
    }

    public void printLibraryInventory(int option) {
        switch (option) {
            case 1:
                categories.get(0).printBooks();
                break;
            case 2:
                categories.get(1).printBooks();
                break;
            case 3:
                categories.get(2).printBooks();
                break;
            case 4:
                for (Category category : categories) {
                    category.printBooks();
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public boolean deleteBook(String categoryName, String title) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                return category.deleteBook(title);
            }
        }
        return false;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
