package picadillybookstore;

import java.util.ArrayList;
import java.util.Arrays;

import picadillybookstore.domain.Admin;
import picadillybookstore.domain.Binding;
import picadillybookstore.domain.Book;
import picadillybookstore.domain.Customer;
import picadillybookstore.domain.Gender;
import picadillybookstore.domain.Signed;
import picadillybookstore.domain.Transaction;
import picadillybookstore.domain.User;

/**
* This class is the container of main function
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
public class PicadillyBookStore {

    /**
     * @param args the command line arguments
     */
    
    //------------
    // Array List Initialization
    //------------
        public static ArrayList<Book> bookCatalog;
        public static ArrayList<Customer> customerList;
        public static ArrayList<Admin> adminList;
        
    public static void main(String[] args) {
        Book b1, b2, b3;
        Customer c1, c2;
        Admin a1, a2;
        
        // Defining 3 books
        b1 = new Book("George Berkowski", "How to Build A Billion Dollar App", "978-0-349-40137-9", (long) 246221, (long) 5, "Little, Brown Book Group", 2015, "An accessible, step-by-step guide to building an app-based business—essential reading for anyone who has an idea for an app, but is unsure of where to start", Binding.PAPERBACK, Signed.NOTSIGNED, (ArrayList<String>) Arrays.asList("app", "business", "startup", "technology", "mobile"), (ArrayList <String>) Arrays.asList("business"));
        b2 = new Book("Jean Hugard & Frederick Braue", "The Royal Road to Card Magic", "978-1-936759-01-9", (long) 134477, (long) 7, "Harper & Brothers Publishers", 2011, "With the help of this book, anyone can develop a versatile repertoire of first-rate card tricks. In fact, mastery of just the first chapter will enable you to perform a half-dozen astounding and entertaining sleights of hand. This exciting introduction to card conjuring will enable even beginners to develop professional-level skill and the ability to perform tricks guaranteed to astound family and friends.", Binding.PAPERBACK, Signed.NOTSIGNED, (ArrayList<String>) Arrays.asList("card", "magic", "houdini", "entertainment"), (ArrayList<String>) Arrays.asList("entertainment"));
        b3 = new Book("William Poundstone", "Are You Smart Enough to Work at Google?", "978-0-316-09997-4", (long) 171770, (long) 10, "Little, Brown and Company", 2012, "Trick Questions, Zen-like Riddles, Insanely Difficult Puzzles, and Other Devious Interviewing Techniques You Need to Know to Get a Job Anywhere in the New Economy", Binding.PAPERBACK, Signed.NOTSIGNED, (ArrayList<String>) Arrays.asList("google", "smart", "intelligence", "work"), (ArrayList<String>) Arrays.asList("career"));
        
        // Adding 3 books to Book array list
        bookCatalog = new ArrayList<Book>();
        bookCatalog.add(b1);
        bookCatalog.add(b2);
        bookCatalog.add(b3);
        
        // Defining 2 customers
        c1 = new Customer((long) 1, "Albert Darmawan", Gender.MALE, "darmawanalbert", "123456", "darmawanalbert@gmail.com", "081281123450", 0, "Jalan Citandui 1 Taman Tirta Golf", "Tangerang Selatan", "15310", "Indonesia", "Albert Darmawan", "0000105623403209", "145", "05", "18");
        c2 = new Customer((long) 2, "Matthew Kharli", Gender.MALE, "matthewk", "098765", "matthewk@gmail.com", "08119001771", 0, "715 Slater Avenue", "Pleasant Hill", "94523", "USA", "Matthew Kharli", "1010001011110100", "010", "10", "10");
        
        // Adding 2 customers to Customer array list
        customerList = new ArrayList<Customer>();
        customerList.add(c1);
        customerList.add(c2);
        
        // Defining 2 admins
        a1 = new Admin((long) 3, "Tri Asih Budiono", Gender.MALE, "tabudi", "ouch", "tabudi@gmail.com", "085632456732");
        a2 = new Admin((long) 4, "Elbert Christopher Larosa", Gender.MALE, "elbert", "bejo", "elbertcl@yahoo.com", "0818833551");
        
        // Adding 2 admins to Admin array list
        adminList = new ArrayList<Admin>();
        adminList.add(a1);
        adminList.add(a2);
        
        // Output
        System.out.print("                      Piccadily Book Store");
        System.out.print("\n----------------------------------------------------------------\n\n\n");
        
        System.out.print("                 Welcome to Piccadily Book Store!");
        
    }
    
}
