package picadillybookstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import picadillybookstore.domain.Admin;
import picadillybookstore.domain.Binding;
import picadillybookstore.domain.Book;
import picadillybookstore.domain.Customer;
import picadillybookstore.domain.Gender;
import picadillybookstore.domain.Signed;
import picadillybookstore.domain.Transaction;
import picadillybookstore.domain.User;
import picadillybookstore.domain.PurchaseStatus;

/**
* This class is the container of main function
*
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
    public static void main(String[] args) {
        Book b1, b2, b3;
        Customer c1, c2;
        Admin a1, a2;
        
        
        
        // Defining 3 books
        b1 = new Book("George Berkowski", "How to Build A Billion Dollar App", "978-0-349-40137-9", (long) 246221, (long) 5, "Little, Brown Book Group", 2015, "An accessible, step-by-step guide to building an app-based business—essential reading for anyone who has an idea for an app, but is unsure of where to start", Binding.PAPERBACK, Signed.NOTSIGNED, Arrays.asList("app", "business", "startup", "technology", "mobile"), Arrays.asList("business"));
        b2 = new Book("Jean Hugard & Frederick Braue", "The Royal Road to Card Magic", "978-1-936759-01-9", (long) 134477, (long) 7, "Harper & Brothers Publishers", 2011, "With the help of this book, anyone can develop a versatile repertoire of first-rate card tricks. In fact, mastery of just the first chapter will enable you to perform a half-dozen astounding and entertaining sleights of hand. This exciting introduction to card conjuring will enable even beginners to develop professional-level skill and the ability to perform tricks guaranteed to astound family and friends.", Binding.PAPERBACK, Signed.NOTSIGNED, Arrays.asList("card", "magic", "houdini", "entertainment"), Arrays.asList("entertainment"));
        b3 = new Book("William Poundstone", "Are You Smart Enough to Work at Google?", "978-0-316-09997-4", (long) 171770, (long) 10, "Little, Brown and Company", 2012, "Trick Questions, Zen-like Riddles, Insanely Difficult Puzzles, and Other Devious Interviewing Techniques You Need to Know to Get a Job Anywhere in the New Economy", Binding.PAPERBACK, Signed.NOTSIGNED, Arrays.asList("google", "smart", "intelligence", "work"), Arrays.asList("career"));
        
        // Adding 3 books to Book array list
        bookCatalog = new ArrayList<>();
        bookCatalog.add(b1);
        bookCatalog.add(b2);
        bookCatalog.add(b3);
        
        // Defining 2 customers
        c1 = new Customer((long) 1, "Albert Darmawan", Gender.MALE, "darmawanalbert", "123456", "darmawanalbert@gmail.com", "081281123450", 0, "Jalan Citandui 1 Taman Tirta Golf", "Tangerang Selatan", "15310", "Indonesia", "Albert Darmawan", "0000105623403209", "145", "05", "18");
        c2 = new Customer((long) 2, "Matthew Kharli", Gender.MALE, "matthewk", "098765", "matthewk@gmail.com", "08119001771", 0, "715 Slater Avenue", "Pleasant Hill", "94523", "USA", "Matthew Kharli", "1010001011110100", "010", "10", "10");
        
        // Adding 2 customers to Customer array list
        customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        
        // Defining 2 admins
        a1 = new Admin((long) 3, "Tri Asih Budiono", Gender.MALE, "tabudi", "ouch", "tabudi@gmail.com", "085632456732");
        a2 = new Admin((long) 4, "Elbert Christopher Larosa", Gender.MALE, "elbert", "bejo", "elbertcl@yahoo.com", "0818833551");
        
        // Adding 2 admins to Admin array list
        adminList = new ArrayList<>();
        adminList.add(a1);
        adminList.add(a2);
        
        // Creating Transaction array List
        transactionHistory = new ArrayList<>();
        
        // Output
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
    
    private static void attemptToPurchaseBook(Customer customerInvolved, Book bookInvolved)
    {
        Transaction currentTransaction;
        Date currentDate;
        
        System.out.println(customerInvolved.getName()+" is trying to buy \"" + bookInvolved.getTitle() + "\"");
        PurchaseStatus thisPurchaseStatus = customerInvolved.purchaseBook(bookInvolved);
        System.out.println(thisPurchaseStatus.value());
        numberOfTransaction++;
        currentDate = new Date();
        if (thisPurchaseStatus== PurchaseStatus.success)
        {
            currentTransaction = new Transaction(numberOfTransaction,customerInvolved.getUserId(), bookInvolved.getIsbn(), 1,currentDate,true);
            System.out.println("Remaining books titled \""+bookInvolved.getTitle()+"\"" + " : " + bookInvolved.getQuantity());
        }
        else {
            currentTransaction = new Transaction(numberOfTransaction,customerInvolved.getUserId(), bookInvolved.getIsbn(), 1,currentDate,false);
        }
        transactionHistory.add(currentTransaction);
        System.out.println("");
    }
    
}
