package problems;

import java.util.Vector;

public class testpr2 {
	public static void main(String []args) {
		Student s1 = new Student("Assyl", "Almaty", "FIT", 2, 36600);
		Staff s2 = new Staff("Era", "Petro", "NIS", 500000);
		Person s3 = new Person("Nurik", "Astana");
		
		Vector <Person> vp = new Vector <Person>(); 
		
		vp.add(s3);
		vp.add(s1);
		vp.add(s2);
		
		for(Person p: vp) {
			System.out.println(p.toString());
		}
	}
}
