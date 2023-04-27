package finalproj;

import java.util.HashMap;
import java.util.Vector;

/**
* @generated
*/
public class Teacher extends Employee {
    /*fields: */
    private StatusTeacher teacherStatus;
    private Vector<Course> courses;
    private double avgRating;
    private int numbOfRating;
    
    /*Constructor: */
    public Teacher() {

    }

    public Teacher(String name, String surname, String password, StatusTeacher teacherStatus) {
        super(name, surname, password);
        this.teacherStatus = teacherStatus;
        this.courses = new Vector<Course>();
        this.avgRating = 0.0;
        this.numbOfRating = 0;
    }

    /*Getters and setters: */
    
    public double getAvgRating() {
        return this.avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public int getnumbOfRating() {
        return this.numbOfRating;
    }

    public void setRatingCnt(int numbOfRating) {
        this.numbOfRating = numbOfRating;
    }

    public StatusTeacher getTeacherStatus() {
        return this.teacherStatus;
    }

    public void setTeacherStatus(StatusTeacher teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public Vector<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    //                          Operations      
    /*Create and add Course file to Database*/
    public void addCourseFile(String fileName, String courseId, String description) {
        File f = new File(fileName, courseId, description);
        Database.files.add(f);
    }
    /*Create and add Course file to Database*/
    public void deleteCourseFile(String fileName, String courseId) {
        for (File file : Database.files) {
            if(file.getFileName().equals(fileName) && file.getCourseName().equals(courseId)) {
                Database.files.remove(file);
            }
        }
    }
    /*increaseRating: Each time the method is called, we add 1 to the score counter(cnt) and update the overall score*/
    public void addNewRating(int newRate) {
        this.avgRating += newRate;
        this.numbOfRating += 1;
    }
    /*viewRating: Divide the overall rating by the counter(cnt)*/
    public Double viewAvgRating() {
        return avgRating / numbOfRating * 1.0;
    }
    
    /*view Students: view Students from Database and count number of users*/
    public String viewStudents() {
        String allInfo = "";
        int cnt = 1;
        for (User user : Database.users) {
            if(user instanceof Student) {
                Student st = (Student) user;
                allInfo += "\n" + cnt + ".Student Name: " + st.getName()
                + "\nStudent surname: " + st.getSurname()
                + "\nID: " + st.getId() + "\nCourse" + st.getYear() 
                + "\nFaculty: " + st.getFaculty() + "\nDegree: " + st.getDegree() + 
                "\n\n-----------------------------------------------------------------------------";
                cnt++;
            }
        }
        String total = "Number of Students: " + cnt + "\n";
        return total + allInfo;
    }
    
    /*Take Student id then find student in Database*/
    public String viewStudentInfo(String id) {
    	String infoStudent = "";
        for (User user : Database.users) {
            if (user instanceof Student) {
                Student st = (Student) user;
                if (st.getId().equals(id)) {
                	infoStudent += "Student name: " + st.getName() + "\nStudent surname: " + st.getSurname() 
                	+ "\nId: " + st.getId() + "\nFaculty: " + st.getFaculty() +  "\nDegree: " + st.getDegree();
                	break;
                }
            }
        }
        return infoStudent;
    }
    /*create and put a new Mark for Student by student id*/
    public void putMark(String courseName, String studentId, Double firstAtt, Double secondAtt, Double finalGrade) {
        Mark m = new Mark(courseName, studentId, firstAtt, secondAtt, finalGrade);
        Database.marks.add(m);
    }
    /*view Marks: take course name check by equals and get information*/
    public String viewMarks(Course course) {
        String s = "";
        for (Mark mark : Database.marks) {
            if(mark.getCourseName().equals(course.getCourseName())) {
                s += "\nStudent Id: " + mark.getStudentId()
                + "\nFirst Attestation: " + mark.getFirstAtt() 
                + "\nSecond Attestation: " + mark.getSecondAtt()
                + "\nFinal Grade: " + mark.getFinalGrade()
                + "\nTotal Grade: " + mark.getTotalGrade() 
                + "\n" + "Grade Letter: " + mark.convertToLetterGrade() 
                + "\n" + "GPA Grade: " + mark.convertToGPAGrade()  
                + "\n--------------------------------------------------------------------------------------------------\n";
            }
        }
        return s;
    }
    /*view Courses */
    public String viewCourses() {
        String s = "";
        for (Course course : Database.courses) {
            s += "Course Name: " + course.getCourseName()  + "\nDescription: " + course.getDescription() 
            + "\nCourse ID: " + course.getCourseId() +  "\nCredits: " + course.getCredits() +
            "\n-----------------------------------------------------------------\n";
        }
        return s;
    }
    /*info about Teacher: */
    public String infoTeacher() {
        return "Name: " + getName() + ", Surname: " + getSurname() + ", TeacherStatus: " + getTeacherStatus();
    }
    
}
