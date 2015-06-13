/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picadillybookstore.dao;

/**
* This class contains every function related to accessing data from XML and storing data to XML
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-06-06
*/

import java.io.File;
import java.util.List;
import picadillybookstore.domain.Book;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DAO {
    public static Books getAllBooks()
    {
        Books bookListReturned = null;
        try {
            File bookFile = new File("book.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
            // Unmarshaling
            Unmarshaller jaxbUnmarshaller;
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            bookListReturned = (Books) jaxbUnmarshaller.unmarshal(bookFile);

        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
        return bookListReturned;
    }
    public static Books searchBook(String title)
    {
        Books bookCollection = DAO.getAllBooks();
        Books bookListReturned = null;
        // sequential search. Complexity : O(n)
        for (Book bookChecked : bookCollection.getBooks())
        {
            if (bookChecked.getTitle().equalsIgnoreCase(title))
            {
                bookListReturned.getBooks().add(bookChecked);
            }
        }
        return bookListReturned;
    }
    
    public static void addBook(Book bookAdded)
    {
        Books bookCollection = DAO.getAllBooks();
        bookCollection.getBooks().add(bookAdded);
        try {
        File bookFile = new File("book.xml");
        // Marshaling
	
        JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
	// output pretty printed
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
	jaxbMarshaller.marshal(bookCollection, bookFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
    }
    
}
