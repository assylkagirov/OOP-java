package finalproj;

import java.io.IOException;

public class Tests {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s1 = new Student("Assylzhan", "Kagirov", "123456", "21BD121", 2, Faculty.SITE, Degree.BD, DormitoryStatus.NO );
		Student s2 = new Student("Aliar", "Eshzhan",  "123456", "21BD122", 2, Faculty.SITE, Degree.BD, DormitoryStatus.NO );
		Student s3 = new Student("Ali", "Aristanov",  "123456", "21BD123", 2, Faculty.SITE, Degree.BD, DormitoryStatus.YES );
		Student s4 = new Student("Nurgalym", "Dzhambul", "123456", "21BD124", 2, Faculty.SITE, Degree.BD, DormitoryStatus.YES);
    	Database.users.add(s1);
    	Database.users.add(s2);
    	Database.users.add(s3);
    	Database.users.add(s4);
    	
    	Teacher t1 = new Teacher("Pakizar", "Shamoi", "123456", StatusTeacher.SENIORLECTOR);
    	Database.users.add(t1);
    	System.out.println(t1.infoTeacher());

    	Course c1 = new Course("OOP", 3, "CSCI_OOP", t1, "Object-oriented programming (OOP) is an approach in which a program is considered as a set of objects interacting with each other.");
    	Database.courses.add(c1);
    	Database.studentRegistration.put("21BD121", c1);
    	Database.studentRegistration.put("21BD122", c1);
    	Database.studentRegistration.put("21BD123", c1);
    	Database.studentRegistration.put("21BD124", c1);
    	//System.out.println(Database.studentRegistration);
//    	Database.save();
    	
    	/*
    	System.out.println("Login: " + s1.getLogin() + "\nPassword: " + s1.getPassword());
		for(User u : Database.users) {
            if(u.getLogin().equals(s1.getLogin())) {
                if(u.getPassword().equals(s1.getPassword())) {
                    System.out.println("You are successfully logged in.\nWelcome " + u.getName() + ".");
                }
            }
		}
		*/
    	s1.rateTeacher(t1.getName(), 5);
    	s2.rateTeacher(t1.getName(), 4);
    	s3.rateTeacher(t1.getName(), 5);
    	s4.rateTeacher(t1.getName(), 4);
    	
//    	System.out.println("Rating " + t1.getName() + " " + t1.getSurname()+ " : " + t1.viewRating());
    	
    	
    	t1.putMark(c1.getCourseName(), s1.getId(), 30.0, 25.0, 40.0);
    	t1.putMark(c1.getCourseName(), s2.getId(), 30.0, 30.0, 40.0);
    	System.out.println(t1.viewMarks(c1));
    	
    	System.out.println(t1.infoTeacher());
    	System.out.println(t1.getName() + " " + t1.getSurname());
    	System.out.println(t1.viewCourses());
    	
    	System.out.println(s1.toString());
    	System.out.println(t1.viewStudentInfo(s1.getId()));
    	
    	System.out.println(t1.toString());
    	System.out.println(s1.viewTeacherInfo(t1.getName()));
    	
    	Manager m1 = new Manager("Let", "Gp", "050581", Managers.OFFICERESGISTER);
    	Database.users.add(m1);
    	Database.save();
    	s1.accessToDormitory();
       	m1.addToDormitory(s1.getId());
       	s1.accessToDormitory();
       	UniNews n1 = new UniNews("Final OOP", "Exam Date moved from 23/12/2022 to 22/12/2022");
        UniNews n2 = new UniNews("Final BRB", "Exam Date: 26/12/2022");
        Database.UniNews.add(n1);
        Database.UniNews.add(n2);
        Database.save();
        
        System.out.println(n1.getUniNewsInfo());
    	System.out.println();
    	
    	Student s5 = new Student("Harry", "Maguaier", "123456", "21BD124", 2, Faculty.SITE, Degree.BD, DormitoryStatus.YES);
    	Database.users.add(s5);
    	Database.save();
    	
    	
    	
    	
	}
}




