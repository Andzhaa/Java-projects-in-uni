package Library_managment;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<String, Object> details;

    public Book(String author, int year, String title, double price) {
        details = new HashMap<>();
        details.put("Author", author);
        details.put("Year of publishing", year);
        details.put("Title", title);
        details.put("Price", price);
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public String toString() {
        return "\nAuthor: " + details.get("Author") +
               "\nYear of Publishing: " + details.get("Year of publishing") +
               "\nTitle: " + details.get("Title") + "\nPrice: $" + details.get("Price");
    }
}
