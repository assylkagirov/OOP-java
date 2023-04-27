package finalproj;

import java.util.List;
import java.io.IOException;

/**
* @generated
*/
public class Admin extends Employee {
    
    public Admin(String name, String surname, String password) {
        super(name, surname, password);
    }
    
    
    //                          Operations                               
    /*Create Operations: 
     * Create all User types*/
    
    /*Create Manager and add to Database*/
    public void createManager(String name, String surname, String password) {
        Manager m = new Manager(name, surname, password,Managers.DEPARTMENTS);
        Database.users.add(m);
    }
    
    /*Create Teacher and add to Database*/
    public void createTeacher(String name, String surname, String password) {
        Teacher t = new Teacher(name, surname, password, StatusTeacher.TUTOR);
        Database.users.add(t);
    }
    
    /*Create Librarian and add to Database*/
    public void createLibrarian(String name, String surname, String password) {
        Librarian l = new Librarian(name, surname, password);
        Database.users.add(l);
    }
    
    /*Create Student and add to Database*/
    public void createStudent(String name, String surname, String password, String id, Integer Year, Faculty faculty, Degree degree, DormitoryStatus dormitoryStatus) {
        Student st = new Student(name, surname, password, id, Year, Faculty.SITE, Degree.BD, DormitoryStatus.NO);
        Database.users.add(st);
    }

    /**
    * @generated
    */
    /*Remove User -> find user in Database by login and remove, if user remove return true*/
    public boolean removeUser(String login) {
        for(User u: Database.users){
            if(u.getLogin().equals(login)){
                Database.users.remove(u);
                return true;
            }
        }
        return false;
    }
    public String getUsers() {
        String s = "";
        for(User u : Database.users) {
            s += u.toString();
        }
        return s;
    }

    /**z	
    * @generated
    */
    public void seeLogFiles() {
        //TODO
    }
    
}