// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

public class Book
{
    String title;
    String ISBN;
    String author;
    double price;
    
    Book() {
        this.title = null;
        this.ISBN = null;
        this.author = null;
        this.price = 0.0;
    }
    
    Book(final String title, final String ISBN, final String author, final double price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }
    
    void bookDetails() {
        System.out.println();
        System.out.println("Title:" + this.title);
        System.out.println("Author:" + this.author);
        System.out.println("ISBN:" + this.ISBN);
        System.out.println("Price:" + this.price);
    }
}
