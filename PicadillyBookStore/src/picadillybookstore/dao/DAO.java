/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picadillybookstore.dao;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import picadillybookstore.domain.Book;
import picadillybookstore.domain.Customer;
import picadillybookstore.domain.Admin;
import picadillybookstore.domain.Transaction;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
* This class contains every function related to accessing data from XML and storing data to XML
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-06-13
*/
public class DAO {
    //----------------
    // Book-related functions
    //----------------
    
    public static Books getAllBooks()
    {
        Books bookListReturned;
        bookListReturned = null;
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
    
    public static Books searchBook(String input)
    {
        Books bookCollection = (Books) DAO.getAllBooks();
        Books bookListReturned = null;
        String bookTitle;
        input = input.toLowerCase();
        // sequential search. Complexity : O(n)
        for (Book bookChecked : bookCollection.getBooks())
        {
            bookTitle = bookChecked.getTitle().toLowerCase();
            if (bookTitle.contains(input))
            {
                bookListReturned.getBooks().add(bookChecked);
            }
        }
        return bookListReturned;
    }
    
    public static void addBook(Book bookAdded)
    {
        Books bookCollection = (Books) DAO.getAllBooks();
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
    
    public static void deleteBook(String isbn)
    {
        Books bookCollection = (Books) DAO.getAllBooks();
        try {
            File bookFile = new File("book.xml");
            // Marshaling
            int loopCounter = 0;
            for (Book bookChecked : bookCollection.getBooks())
            {
                if (bookChecked.getIsbn().equals(isbn))
                {
                    bookCollection.getBooks().remove(loopCounter);
                }
                loopCounter++;
            }
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
    
    public static void replaceBookData(Book bookEdited)
    {
        Books bookCollection = (Books) DAO.getAllBooks();
        String bookCheckedIsbn;
        String bookEditedIsbn = bookEdited.getIsbn();
        Books newBookCollection = new Books();
        newBookCollection.setBooks(new ArrayList<Book>());
        /*long previousQuantity = bookEdited.getQuantity();
        Book bookWithUpdatedQuantity = (Book) bookEdited;    
        bookWithUpdatedQuantity.setQuantity(previousQuantity+quantityIncreased);*/
        try {
            File bookFile = new File("book.xml");
            // Marshaling
            for (Book bookChecked : bookCollection.getBooks())
            {
                bookCheckedIsbn = bookChecked.getIsbn();
                if (bookCheckedIsbn.equals(bookEditedIsbn))
                {
                    newBookCollection.getBooks().add(bookEdited);
                }
                else {
                    newBookCollection.getBooks().add(bookChecked);
                }
            }
            JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
            jaxbMarshaller.marshal(newBookCollection, bookFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
    }
    //----------------
    // Customer-related functions
    //----------------
    
    public static Customers getAllCustomers()
    {
        Customers customerListReturned;
        customerListReturned = null;
        try {
            File customerFile = new File("customer.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
            // Unmarshaling
            Unmarshaller jaxbUnmarshaller;
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            customerListReturned = (Customers) jaxbUnmarshaller.unmarshal(customerFile);

        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
        return customerListReturned;
    }
    
    public static Customers searchCustomer(String input)
    {
        Customers customerList = (Customers) DAO.getAllCustomers();
        Customers customerListReturned = null;
        // sequential search. Complexity : O(n)
        long inputLong = Long.valueOf(input);
        input = input.toLowerCase();
        String customerName;
        for (Customer customerChecked : customerList.getCustomers())
        {
            customerName = customerChecked.getName().toLowerCase();
            if (customerChecked.getUserId() == inputLong || customerName.contains(input))
            {
                customerListReturned.getCustomers().add(customerChecked);
            }
        }
        return customerListReturned;
    }
    public static void addCustomer(Customer customerAdded)
    {
        Customers customerList = (Customers) DAO.getAllCustomers();
        customerList.getCustomers().add(customerAdded);
        try {
        File customerFile = new File("customer.xml");
        // Marshaling
	
        JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
	// output pretty printed
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
	jaxbMarshaller.marshal(customerList, customerFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
    }
    public static void replaceCustomerData(Customer customerEdited)
    {
        Customers customerCollection = (Customers) DAO.getAllCustomers();
        long customerCheckedUserId;
        long customerEditedUserId = customerEdited.getUserId();
        Customers newCustomerCollection = new Customers();
        newCustomerCollection.setCustomers(new ArrayList<Customer>());
        /*long previousQuantity = bookEdited.getQuantity();
        Book bookWithUpdatedQuantity = (Book) bookEdited;    
        bookWithUpdatedQuantity.setQuantity(previousQuantity+quantityIncreased);*/
        try {
            File customerFile = new File("customer.xml");
            // Marshaling
            for (Customer customerChecked : customerCollection.getCustomers())
            {
                customerCheckedUserId = customerChecked.getUserId();
                if (customerCheckedUserId == customerEditedUserId)
                {
                    newCustomerCollection.getCustomers().add(customerEdited);
                }
                else {
                    newCustomerCollection.getCustomers().add(customerChecked);
                }
            }
            JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
            jaxbMarshaller.marshal(newCustomerCollection, customerFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
    }
    public static long numberOfCustomers()
    {
        Customers customerCollection = (Customers) DAO.getAllCustomers();
        long customerCount = 0;
        for (Customer customerChecked : customerCollection.getCustomers())
        {
            customerCount++;
        }
        return customerCount;
    }
    //----------------
    // Admin-related functions
    //----------------
    public static Admins getAllAdmins()
    {
        Admins adminListReturned;
        adminListReturned = null;
        try {
            File adminFile = new File("admin.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Admins.class);
            // Unmarshaling
            Unmarshaller jaxbUnmarshaller;
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            adminListReturned = (Admins) jaxbUnmarshaller.unmarshal(adminFile);

        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
        return adminListReturned;
    }
    
    public static void addAdmin(Admin adminAdded)
    {
        Admins adminList = (Admins) DAO.getAllAdmins();
        adminList.getAdmins().add(adminAdded);
        try {
        File adminFile = new File("admin.xml");
        // Marshaling
	
        JAXBContext jaxbContext = JAXBContext.newInstance(Admins.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
	// output pretty printed
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
	jaxbMarshaller.marshal(adminList, adminFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
    }
    
    //----------------
    // Transaction-related functions
    //----------------
    public static Transactions getAllTransactions()
    {
        Transactions transactionListReturned;
        transactionListReturned = null;
        try {
            File transactionFile = new File("transaction.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Transactions.class);
            // Unmarshaling
            Unmarshaller jaxbUnmarshaller;
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            transactionListReturned = (Transactions) jaxbUnmarshaller.unmarshal(transactionFile);

        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
            
        }
        return transactionListReturned;
    }
    
    public static void addTransaction(Transaction transactionAdded)
    {
        Transactions transactionList = (Transactions) DAO.getAllTransactions();
        transactionList.getTransactions().add(transactionAdded);
        try {
        File transactionFile = new File("transaction.xml");
        // Marshaling
	
        JAXBContext jaxbContext = JAXBContext.newInstance(Transactions.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
	// output pretty printed
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
	jaxbMarshaller.marshal(transactionList, transactionFile);
        }
        catch (JAXBException e)
        {
            System.out.println("JAXB error,  " + e.getMessage() );
        }
    }
}
