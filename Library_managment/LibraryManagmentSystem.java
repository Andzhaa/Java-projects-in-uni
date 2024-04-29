package Library_managment;

import java.util.Scanner;

public class LibraryManagmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("     _________________________________________ ");
            System.out.println("    |       Library Management System         |");
            System.out.println("    |-----------------------------------------|");
            System.out.println("    | 1. Add a book                           |");
            System.out.println("    | 2. Print library inventory              |");
            System.out.println("    | 3. Delete a book                        |");
            System.out.println("    | 4. Exit                                 |");
            System.out.println("    |_________________________________________|");
            System.out.print("            Choose an option -> ");
            int option;
            while (true) {
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    scanner.nextLine();
                    if (option >= 1 && option <= 4) {
                        break;
                    }
                }
                scanner.nextLine(); 
                System.out.println("Invalid option. Please try again.");
                System.out.print("          Choose an option -> ");
            }

            switch (option) {
                case 1:
                    String category;
                    while (true) {
                        System.out.print("Enter category (Science, Technology, Novels): ");
                        category = scanner.nextLine().trim();
                        if (category.equalsIgnoreCase("Science") ||
                            category.equalsIgnoreCase("Technology") ||
                            category.equalsIgnoreCase("Novels")) {
                            break;
                        } else {
                            System.out.println("Invalid category. Please enter a valid category (Science, Technology, Novels).");
                        }
                    }

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    int year;
                    while (true) {
                        System.out.print("Enter year of publishing: ");
                        if (scanner.hasNextInt()) {
                            year = scanner.nextInt();
                            scanner.nextLine();
                            break; 
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.nextLine();
                        }
                    }

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    double price;
                    while (true) {
                        System.out.print("Enter price: ");
                        if (scanner.hasNextDouble()) {
                            price = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.nextLine();
                        }
                    }
                    
                    

                    Book book = new Book(author, year, title, price);
                    library.addBook(category, book);
                    break;
                
                case 2:
                    System.out.println("     _________________________________________ ");
                    System.out.println("    |       Print Library Inventory:          |");
                    System.out.println("    |-----------------------------------------|");
                    System.out.println("    | 1. Print Science books                  |");
                    System.out.println("    | 2. Print Technology books               |");
                    System.out.println("    | 3. Print Novels                         |");
                    System.out.println("    | 4. Print all                            |");
                    System.out.println("    |_________________________________________|");
                    System.out.print("Choose an option: ");
                    int printOption = scanner.nextInt();
                    scanner.nextLine();

                    library.printLibraryInventory(printOption);
                    break;
                
                case 3:
                    String deleteCategory;
                    while (true) {
                        System.out.print("Enter category (Science, Technology, Novels): ");
                        deleteCategory = scanner.nextLine().trim();
                        if (deleteCategory.equalsIgnoreCase("Science") ||
                            deleteCategory.equalsIgnoreCase("Technology") ||
                            deleteCategory.equalsIgnoreCase("Novels")) {
                            break;
                        } else {
                            System.out.println("Invalid category. Please enter a valid category (Science, Technology, Novels).");
                        }
                    }

                    System.out.print("Enter title of the book to delete: ");
                    String deleteTitle = scanner.nextLine();

                    if (library.deleteBook(deleteCategory, deleteTitle)) {
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}