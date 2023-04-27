package finalproj;

import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

/**
* @generated
*/
public class Librarian extends Employee {
    
    public Librarian(String name, String surname, String password) {
        super(name, surname, password);
        //TODO Auto-generated constructor stub
    }

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean addBook(String title, String id) {
        // TODO: existingBookException
        Book b = new Book(title, id);
        if(!Database.books.contains(b)) {
            Database.books.add(b);
            return true;
        } 
        return false;
    }
    /**
    * @generated
    */
    public boolean removeBook(String id) {
        // TODO: notExistingBookException
        for (Book book : Database.books) {
            if(book.getId().equals(id)) {
                Database.books.remove(book);
                return true;
            }
        }
        return false;
    }
    
}
