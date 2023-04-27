package classwork;

public class teststudent {
	public static void main(String[]args)
	{
	Student student1= new Student(null, 1);
	student1.name = "John";
	student1.setID(213);
	System.out.println(student1.getID());
	}
}