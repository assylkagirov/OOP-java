package lab1task4;
import java.util.Vector;
import practice3.Student;

public class GradeBook {
	
	int sum = 0;
	double average, maximum, minimum;
	public Vector<Student> students = new Vector<Student>();
	
	GradeBook(){
	}

	//adding student to a class
	public void addStudent(Student s) {
		
		students.add(s);
	}
	//displaying message in console from gradebookteest (tosting methods)
	public String displayMessage(Course c) {
		
		return "Welcome to the grade book for " + c.toString() + "!";
	}
	
		//finding average data by calculation 
	public double determineClassAverage() {
		
		for(int i = 0; i < students.size();i++) {
			
			sum += students.get(i).getGrade();
		}
		
		average = sum / students.size();
		return average;
	}
	
	//finding mimimum data 
	public String determineClassMinimum(){
		
		String namemin = "";
		int idmin = 0;
		
		minimum = students.get(0).getGrade();
		
		for(int i = 0; i < students.size(); i++) {
			
			if(minimum > students.get(i).getGrade()) {
				
				minimum = students.get(i).getGrade();
				namemin = students.get(i).getName();
				idmin = students.get(i).getID();
				
			}
		}
		return minimum + "(Student " + namemin + ", id: " + idmin + ")";
	}
	
	//finding maximum data
	public String determineClassMaximum(){
		
		String namemax = "";
		int idmax = 0;
		
		maximum = students.get(0).getGrade();
		
		for(int i = 0; i < students.size(); i++) {
			
			if(maximum < students.get(i).getGrade()) {
				
				maximum = students.get(i).getGrade();
				namemax = students.get(i).getName();
				idmax = students.get(i).getID();
				
			}
		}
		
		return maximum + "(Student " + namemax + ", id: " + idmax + ")";
	}
	
	//displaying all information about grades 
	public String displayGradeReport() {
		return "Class average is " + determineClassAverage() + ". Lowest grade is " + determineClassMinimum() + ".\nHighest grade is " + determineClassMaximum();
	}
	
	//Bar chart)
	public void outputBarChart() {
		// these int is to divide by points and write * in the pointers
		int p1 = 0; 
		int p2 = 0;
		
		//loop is divide and write * where student had points from 0 to 99
		while(p1 <= 99) {
			p2 = p1 + 9;
			System.out.print(p1 + "-" + p2 + ": ");
			
			for(int i = 0; i < students.size(); i++) {
				
				if(students.get(i).getGrade() >= p1 && students.get(i).getGrade() <= p2) {
					System.out.print("*");
					
				}
			}
			
			System.out.println();
			p1 = p2 + 1;
			
		
		}
		System.out.print("100: ");
		
		//loop is divide and write * where student had points in 100
		for(int i = 0; i < students.size(); i++) {
			
			if(students.get(i).getGrade() == 100) {
				
				System.out.print("*");
				
			}
		}
	}
	
	
}