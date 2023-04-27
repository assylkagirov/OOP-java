package lab1task4;

import java.util.Scanner;
import practice3.Student;

public class GradeBookTest {
	public static void main(String[] args) {
		GradeBook gradebook = new GradeBook();
		Course c = new Course("Object-oriented Programming and Design", "CS101", 5, "PP1");
		Student s1 = new Student("A", 1);
		Student s2 = new Student("B", 2 );
		Student s3 = new Student("C", 3);
		Student s4 = new Student("D", 4);
		Student s5 = new Student("E", 5);
		Student s6 = new Student("F", 6);
		Student s7 = new Student("G", 7);
		Student s8 = new Student("H", 8);
		Student s9 = new Student("I", 9);
		Student s10 = new Student("J", 10);
		
		gradebook.addStudent(s1);
		gradebook.addStudent(s2);
		gradebook.addStudent(s3);
		gradebook.addStudent(s4);
		gradebook.addStudent(s5);
		gradebook.addStudent(s6);
		gradebook.addStudent(s7);
		gradebook.addStudent(s8);
		gradebook.addStudent(s9);
		gradebook.addStudent(s10);
		
		
		System.out.println(gradebook.displayMessage(c));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please, input grades for students:");
		
		//loop where we are output grades
		for(int i = 0;i < gradebook.students.size();i++) {
			
			System.out.print(gradebook.students.get(i).toString());
			int p= sc.nextInt();
			gradebook.students.get(i).setGrade(p);
		}
		
		System.out.println(gradebook.displayGradeReport());
		System.out.println("Grades distribution:");
		gradebook.outputBarChart();

	}
}