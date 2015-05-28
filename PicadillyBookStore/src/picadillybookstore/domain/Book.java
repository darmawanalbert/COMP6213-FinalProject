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
    String publisherInfo;
    int yearPublished;
    String description;
    ArrayList<String> keywords = new ArrayList<>();
    ArrayList<String> category = new ArrayList<>(); 
    
    //----------------
    // Constructor(s).
    //----------------
    public Book(String author, String title, String isbn, long price, long quantity, String publisherInfo, int yearPublished, String description, ArrayList<String> keywords, ArrayList<String> category) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
        this.publisherInfo = publisherInfo;
        this.yearPublished = yearPublished;
        this.description = description;
        this.keywords = keywords;
        this.category = category;
    }
    
    //----------------------------------
    // Accessor/Mutator methods.
    //----------------------------------

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getPublisherInfo() {
        return publisherInfo;
    }

    public void setPublisherInfo(String publisherInfo) {
        this.publisherInfo = publisherInfo;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public ArrayList<String> getCategory() {
        return category;
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
