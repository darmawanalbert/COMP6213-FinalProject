package picadillybookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Date;

import picadillybookstore.domain.Admin;
import picadillybookstore.domain.Binding;
import picadillybookstore.domain.Book;
import picadillybookstore.domain.Customer;
import picadillybookstore.domain.Gender;
import picadillybookstore.domain.Signed;
import picadillybookstore.domain.Transaction;
import picadillybookstore.domain.PurchaseStatus;
import picadillybookstore.dao.DAO;
import picadillybookstore.dao.Books;
import picadillybookstore.dao.Customers;
import picadillybookstore.dao.Admins;
import picadillybookstore.dao.Transactions;

/**
* PicadillyBookStore.java
* This class is the container of main function
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
public class PicadillyBookStore {    
    //------------
    // Array List Initialization
    //------------
        public static ArrayList<Book> bookCatalog;
        public static ArrayList<Customer> customerList;
        public static ArrayList<Admin> adminList;
        public static ArrayList<Transaction> transactionHistory;
        public static int numberOfTransaction = 0;
        
    /**
     *
     * @param args
     */
    
    //------------
    // Main Functions
    //------------
    public static void main(String[] args) {
        // Object variable declaration and initialization
        Book b1 = null, b2 = null, b3 = null;
        Customer c1 = null, c2 = null;
        Admin a1 = null, a2 = null;
        
        // Retrieve data from book.xml and put it in Book variables
        Books bookCollection = (Books) DAO.getAllBooks();
        int booksLoopCounter = 1;
        for (Book bookChecked : bookCollection.getBooks())
        {
            switch(booksLoopCounter)
            {
                case 1:
                    b1 = bookChecked;
                    break;
                case 2:
                    b2 = bookChecked;
                    break;
                case 3:
                    b3 = bookChecked;
                    break;
            }
           booksLoopCounter++;
        }
        
        // Adding 3 books to Book array list
        bookCatalog = new ArrayList<>();
        bookCatalog.add(b1);
        bookCatalog.add(b2);
        bookCatalog.add(b3);
        
        // Retrieve data from customer.xml and put it in Customer variables
        Customers customerCollection = (Customers) DAO.getAllCustomers();
        int customersLoopCounter = 1;
        for (Customer customerChecked : customerCollection.getCustomers())
        {
            switch(customersLoopCounter)
            {
                case 1:
                    c1 = customerChecked;
                    break;
                case 2:
                    c2 = customerChecked;
                    break;
            }
           customersLoopCounter++;
        }
        
          
        // Adding 2 customers to Customer array list
        customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        
        
        // Retrieve data from admin.xml and put it in Admin variables
        Admins adminCollection = (Admins) DAO.getAllAdmins();
        int adminsLoopCounter = 1;
        for (Admin adminChecked : adminCollection.getAdmins())
        {
            switch(adminsLoopCounter)
            {
                case 1:
                    a1 = adminChecked;
                    break;
                case 2:
                    a2 = adminChecked;
                    break;
            }
           adminsLoopCounter++;
        }
        
        // Adding 2 admins to Admin array list
        adminList = new ArrayList<>();
        adminList.add(a1);
        adminList.add(a2);
        
        // Creating Transaction array List
        transactionHistory = new ArrayList<>();
        
        // Outputing Title
        System.out.println("================================================================");
        System.out.println("                 Welcome to Picadilly Book Store! \n\tWhere customer's satisfaction is our main priority");
        System.out.println("================================================================");
        
        // Displaying Books List
        System.out.println("================================================================");
        System.out.println("                           Book List");
        System.out.println("================================================================");
        
        for (Book eachBook : bookCatalog) {
             eachBook.display();
        }
       
        // Displaying Customer List
        System.out.println("================================================================");
        System.out.println("                          Customer List");
        System.out.println("================================================================");
        
        for (Customer eachCustomer : customerList) {
             eachCustomer.display();
        }    
       
        // Displaying Admin List
        System.out.println("================================================================");
        System.out.println("                           Admin List");
        System.out.println("================================================================");
        
        for (Admin eachAdmin : adminList) {
             eachAdmin.display();
        } 
        
        // Customers start to purchase books
        System.out.println("================================================================");
        System.out.println("                       Book Purchasing");
        System.out.println("================================================================");
        attemptToPurchaseBook(c1,b1);
        attemptToPurchaseBook(c2,b2);
       
        // Transaction History
        System.out.println("================================================================");
        System.out.println("                     Transaction History");
        System.out.println("================================================================");
    
        for (Transaction eachTransaction : transactionHistory) {
             eachTransaction.display();
        } 
    }
    
    //------------
    // Function to manage book purchasing
    //------------
    private static void attemptToPurchaseBook(Customer customerInvolved, Book bookInvolved)
    {
        Transaction currentTransaction;
        Date currentDate;
        System.out.println(customerInvolved.getName()+" is trying to buy \"" + bookInvolved.getTitle() + "\"");
        PurchaseStatus thisPurchaseStatus = customerInvolved.purchaseBook(bookInvolved);
        System.out.println(thisPurchaseStatus.value());
        numberOfTransaction++;
        // Create a new Date object
        currentDate = new Date();
        // Create a new Transaction object 
        currentTransaction = new Transaction();
        currentTransaction.setTransactionId(numberOfTransaction);
        currentTransaction.setCustomerId(customerInvolved.getUserId());
        currentTransaction.setIsbn(bookInvolved.getIsbn());
        currentTransaction.setQuantity(1);
        currentTransaction.setDate(currentDate);
        if (thisPurchaseStatus== PurchaseStatus.success)
        {
            // Updating book and customer information when the purchasing is successful
            DAO.replaceBookData(bookInvolved);
            DAO.replaceCustomerData(customerInvolved);
            currentTransaction.setPaymentVerification(true);
            System.out.println("Remaining books titled \""+bookInvolved.getTitle()+"\"" + " : " + bookInvolved.getQuantity());
        }
        else {
           currentTransaction.setPaymentVerification(false);
        }
        
        // Add currentTransaction to transactionHistory ArrayList
        transactionHistory.add(currentTransaction);
        
        // Add currentTransaction to transaction.xml
        DAO.addTransaction(currentTransaction);
        System.out.println("");
    }
}
