package finalproj;

import java.util.List;


/**
* @generated
*/
public class Employee extends User {
	/*Constructors: */
    public Employee() {

    }
    
    public Employee(String name, String surname, String password) {
        super(name, surname, password);
    }    
  
    

    //                          Operations                                  

    
    public void sendMessage(String messageFrom, String messageTo, String title, String text) {
        Message m = new Message(messageFrom, messageTo, title, text);
        Database.messages.add(m);
    }

    public String getMessages() {
        String mess = "";
        for (Message message : Database.messages) {
            if(message.getMessageTo().equals(this.getLogin())) {
                mess += "\nMessage from: " + message.getMessageFrom() 
                + "\nTitle: " + message.getTitle() 
                + "\nText: " + message.getText() 
                + "\n-----------------------------------------------------------------------\n";
            }
        }
        return mess;
    }
    
}
