/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picadillybookstore.dao;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import picadillybookstore.domain.Book;
/**
 * Books.java
 * This class is the container of Book List<>
 * @author  Albert Darmawan
 * @version 1.0
 * @since   2015-06-13
 */
@XmlRootElement(name="books")
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {
    //------------
    // Attribute
    //------------
    @XmlElement(name="book")
    private List<Book> books = null;
    
    //------------
    // Accessor
    //------------
    public List<Book> getBooks()
    {
        return books;
    }
    
    //------------
    // Mutator
    //------------
    public void setBooks(List<Book> books)
    {
        this.books  =books;
    }
}
