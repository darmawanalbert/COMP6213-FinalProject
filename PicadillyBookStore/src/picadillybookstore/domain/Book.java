package picadillybookstore.domain;

/**
 *
 * @author Elbert Christopher Larosa
 * @version 1.0
 * @since 2015-5-28
 */

import java.util.ArrayList;

public class Book {
    //------------
    // Attributes.
    //------------
    String author;
    String title;
    String isbn;
    long price;
    long quantity;
    String publisherName;
    int yearPublished;
    String description;
    Binding binding;
    Signed signed;
    ArrayList<String> keywords = new ArrayList<>();
    ArrayList<String> category = new ArrayList<>(); 
    
    //----------------
    // Constructor(s).
    //----------------
    public Book(String author, String title, String isbn, long price, long quantity, String publisherName, int yearPublished, String description, Binding binding, Signed signed, ArrayList<String> keywords, ArrayList<String> category) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
        this.publisherName = publisherName;
        this.yearPublished = yearPublished;
        this.description = description;
        this.binding = binding;
        this.signed = signed;
        this.keywords = keywords;
        this.category = category;
    }
    
    //----------------------------------
    // Accessor methods.
    //----------------------------------
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public long getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getDescription() {
        return description;
    }

    public Binding getBinding() {
        return binding;
    }

    public Signed getSigned() {
        return signed;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    //----------------------------------
    // Mutator methods.
    //----------------------------------
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setPrice(long price) {
        this.price = price;
    }
    
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public void setSigned(Signed signed) {
        this.signed = signed;
    }
    
    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
    
    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }
    
    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------
}
