package finalproj;

import java.util.Vector;

/**
* @generated
*/
public class Student extends User {
	/*fields*/
    private String id;
    private Integer Year;
    private Integer totalCredits;
    private Double GPA;
    protected Vector<Course> Courses;
    private Faculty faculty;
    private Degree degree;
    private Integer creditLimit;
    private Integer chosenCredits = 0;
    private DormitoryStatus dormitoryStatus;
	
	/*Constructors: */
    public Student() {

    }

    public Student(String name, String Surname, String password, String id, Integer Year, Faculty faculty, Degree degree, DormitoryStatus dormitoryStatus) {
        super(name, Surname, password);
        this.id = id;
        this.Year = Year;
        this.totalCredits = 0;
        this.GPA = 0.0;
        this.Courses = new Vector<Course>();
        this.faculty = faculty;
        this.degree = degree;
        this.creditLimit = 21;
        this.dormitoryStatus = dormitoryStatus;
    }
    
    public Student(String name, String surname,String password, String id, Integer Year, Integer totalCredits, Double GPA, Vector<Course> Courses, Faculty faculty, Degree degree, Integer creditLimit) {
        super(name, surname, password);
        this.id = id;
        this.Year = Year;
        this.totalCredits = totalCredits;
        this.GPA = GPA;
        this.Courses = Courses;
        this.faculty = faculty;
        this.degree = degree;
        this.creditLimit = creditLimit;

        //TODO Auto-generated constructor stub
    }
    
    /*Setters and Getters: */
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getYear() {
        return this.Year;
    }

    public void setYear(Integer Year) {
        this.Year = Year;
    }

    public Integer getTotalCredits() {
        return this.totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    public Double getGPA() {
        return this.GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public Vector<Course> getCourses() {
        return this.Courses;
    }

    public void setCourses(Vector<Course> Courses) {
        this.Courses = Courses;
    }


    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }


    public Degree getDegree() {
        return this.degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

  
    public Integer getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    public DormitoryStatus getDormitoryStatus() {
    	return this.dormitoryStatus;
    }
    
    public void setDormitoryStatus(DormitoryStatus dormitoryStatus) {
    	this.dormitoryStatus = dormitoryStatus;
    }


    

    //                          Operations                                  
    
    /**
    * @generated
    */
    /*take number of credits and add*/
    public void increaseCredits(int creditCount) {
        this.chosenCredits += creditCount;
    }
    /*registerToCourse: take courseId, find him in Database by using for and registerToCourse*/
    public void registerToCourse(String courseID){
        Course newCourse = null;
        for (Course course : Database.courses) {
            if (course.getCourseId().equals(courseID)) {
                newCourse = course;
                if (this.chosenCredits <= this.creditLimit && newCourse.getIsAvailable()) {
                    Database.studentRegistration.put(this.id, newCourse);
                }
            }
        }
    }
    /*orderBook: by BookId find in Database books using by for and add to orders to Database*/
    public void orderBook(String bookId) {
        Book b = new Book();
        for(Book book : Database.books) {
            if(book.getId().equals(bookId)) {
                b = book;
            }
        }
        Database.orders.put(this.getId(), b);
    } 

    /**
    * @generated
    */
    /*view Teacher Info: find in Database users by name and return method from Teacher infoTeacher*/
    public String viewTeacherInfo(String name) {
        for (User user : Database.users) {
            if(user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if(t.getName().equals(name)) {
                	return t.infoTeacher();
                }
            }
        }
        return "";
    }
    /**
    * @generated
    */
    /*rate Teacher: find teacher in Database users by name and call method from Teacher increaseRating, 
     * which added rating to total and increase count of ratings */
    public void rateTeacher(String teacherName, int newRate) {
        for (User user : Database.users) {
            if(user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if(t.getName().equals(teacherName)) {
                    t.addNewRating(newRate);;
                }
            }
        }
    }
    /**
    * @generated
    */
    /*drop Course*/
    public void dropCourse(String courseId) {
        for (Course course :this.Courses) {
            if (course.getCourseId().equals(courseId)) {
                this.Courses.remove(course);
            }
        }
        // courseDoesNotExistException
    }
    
    /**
    * @generated
    */
    public String viewCourses() {
        String s = "";
        for (Course course : Database.courses) {
            s += "\nCourse Name: " + course.getCourseName() 
            + "\nDescription: " + course.getDescription() 
            + "\nCourse ID: " + course.getCourseId() 
            + "\n-------------------------------------------------------\n";
        }
        return s;
    }
    /**
    * @generated
    */
    public String viewMarks() {
        String s = "";
        for (Mark mark : Database.marks) {
            if(mark.getStudentId().equals(this.id)) {
                s += "\nCourse Name: " + mark.getCourseName()
                + "\nFirst Attestation = " + mark.getFirstAtt() 
                + "\nSecond Attestation = " + mark.getSecondAtt()
                + "\nTotal Attestaion = " + mark.getTotalAtt()
                + "\nFinal Grade of course = " + mark.getFinalGrade()
                + "\nTotal Grade of course = " + mark.getTotalGrade() 
                + "\nLetter Grade of course = " + mark.convertToLetterGrade() 
                + "\nGPA of course = " + mark.convertToGPAGrade() 
                + "\n----------------------------------------------------------------\n";
            }
        }
        return s;
    }
    /**
    * @generated
    */
    public String viewAvailableCourses() {
        String s = "";
        for (Course course : Database.courses) {
            if(course.getIsAvailable()) {
                s += "\nCourse Name: " + course.getCourseName()
                + "\nCourse ID: " + course.getCourseId()
                + "\nCourse credits: " + course.getCredits()
                + "\nCourse description: " + course.getDescription() 
                + "\n----------------------------------------------------\n"; 
            }
        }
        return s;
    }
    /**
    * @generated
    */
    public String viewCourseFiles(String courseName) {
        String s = "";
        for(File file : Database.files) {
            if(file.getCourseName().equals(courseName)) {
                s += "\nFile Name: " + file.getFileName()
                + "\nCourse Name: " + file.getCourseName() 
                + "\nFile description: " + file.getDescription();
            }
        }
        return s;
    }
    
    public String viewTranscript() {
        String s = "";
        int cntOfCourses = 0;
        double allPoints = 0.0;
        Transcript ts = new Transcript();
        for (Mark mark : Database.marks) {
            if(mark.getStudentId().equals(this.id)) {
                allPoints += mark.getTotalGrade();
                cntOfCourses += 1;
                s += "Course Name: " + mark.getCourseName()
                + "\nFirst Attestation: " + mark.getFirstAtt() 
                + "\nSecond Attestation: " + mark.getSecondAtt()
                + "\nFinal Grade: " + mark.getFinalGrade()
                + "\nTotal Grade: " + mark.getTotalGrade() 
                + "\nLetter Grade: " + mark.convertToLetterGrade() 
                + "\nGPA Grade: " + mark.convertToGPAGrade() 
                + "\n----------------------------------\n";
            }
        }
        allPoints /= cntOfCourses;
        s += "Total GPA: " + ts.convertGPA(allPoints);
        return s;
    }

    // @Override
    public String getAllInfo() {
        return "\nName: " + getName() +
            "\nSurname: " + getSurname() +
            "\nId: " + getId() +
            "\nYear: " + getYear() +
            "\nFaculty: " + getFaculty() +
            "\nDegree: " + getDegree() + 
            "\nLive in Dormitory: " + getDormitoryStatus();
    }
    /*Take Student Dormitory Status and check have or not */
    public void accessToDormitory() {
    	if(this.dormitoryStatus == DormitoryStatus.YES) {
    		System.out.println("Entrance is allowed\n" + this.getName() + " have access");
    	}
    	else {
    		System.out.println("Entry is prohibited\n" + this.getName() + " have no access");
    	}
    }
}