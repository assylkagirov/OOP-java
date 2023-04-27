package finalproj;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestDeser {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("users.txt"));
		Object obj = null;
		while((obj = objin.readObject())instanceof EndOfFile == false) {
			System.out.println(obj);
		}
		
	}
}
