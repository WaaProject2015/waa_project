
package mum.edu.model;

public class Book {
    private String title;
    private String author;
    //private String milleage;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
      public static Book createBook(String title, String author, double price){
       return new Book(title,author,price);
   }
}
