package finalproj;

public class UserNotExists extends Exception {
    public UserNotExists(String message){
        super(message);
    }
}