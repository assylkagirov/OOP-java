package finalproj;

import java.io.Serializable;
import java.util.Objects;

/**
* @generated
*/
public abstract class User implements Comparable, Serializable {
    /*fields*/
    private String name;
    private String surname;
    private String login;
    private String password;

    /*User Constructor: */
    public User() {

    }
    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        /*Login Formula = Take name in lower case + Surname in lower case*/
        this.login = this.name.toLowerCase() + "_" + this.surname.toLowerCase() + "@kbtu.kz";
        this.password = password;
    }

    /*Getters and Setters for all fields*/

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    /*Equals: */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    /*HashCode: */
    public int hashCode() {
        return Objects.hash(name, surname, login, password);
    }

    @Override
    /*toString: */
    public String toString() {
        return "Name: " + getName() + ", Surname: " + getSurname() 
        	+ ", Login: " + getLogin() + ", Password: " + getPassword();
    }


    //                          Operations                                  
    /*all News: move in for and add all news to string allNews*/
    public String viewUniNews() {
        String allNews = "";
        for (UniNews news : Database.UniNews) {
            allNews += "Title: " + news.getTitle()  + "\nDescription:" + news.getText() +  
            "\n\n------------------------------------------------------------------------";
        }
        return allNews;
    }
    /**
    * @generated
    */
    /*signIn: Take login, password and check equal or not*/
    public boolean signIn(String login, String password) {
        if(login.equals(this.login) && password.equals(this.password))return true;
        return false;
    }
    /**
    * @generated
    */
    /*change password: take old and new password then check and change password*/
    public boolean changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)) {
            password = newPassword;
            return true;
        }
        return false;
    }
    
    /*CompareTo: */
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
