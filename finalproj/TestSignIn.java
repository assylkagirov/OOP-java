package finalproj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSignIn {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("users.txt"));
//		Object obj = null;
//		while((obj = objin.readObject())instanceof EndOfFile == false) {
//			System.out.println(obj);
//		}
		String password = "123456";
		String login = "asik_kagirov@kbtu.kz";
		for(User u : Database.users) {
            if(u.getLogin().equals(login)) {
                System.out.println("Enter password: ");
                if(u.getPassword().equals(password)) {
                    System.out.println("Successfully authorized.");
                    System.out.println("Welcome " + u.getName() + ".");
                }
            }
		}
	}
}
