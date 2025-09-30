class Book {
    String title;
    String author;
    double price;

        Book() {
        this("Unknown Title", "Unknown Author", 0.0); 
    }

   
    Book(String title, String author, double price) {
        this.title = title;     
        this.author = author;
        this.price = price;
    }


    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price:  + this.price);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book();  
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.0); 

        b1.display();
        b2.display();
    }
}