package finalproj;

import java.util.HashMap;
import java.util.Vector;

/**
* @generated
*/
public class Manager extends Employee {
    
    private Managers managerType;

    public Manager(String name, String surname, String password, Managers managerType) {
        super(name, surname, password);
        this.managerType = managerType;
    }

    
    public Managers getManagerType() {
        return this.managerType;
    }

    public void setManagerType(Managers managerType) {
        this.managerType = managerType;
    }

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void createCourse(String name, int credits, String courseId) {
        
        Course newCourse = new Course(name, credits, courseId);
    	for (Course course: Database.courses) {
        	if (!course.getCourseId().equals(courseId)) {
        		Database.courses.add(newCourse);
        	}
    	}
    }
    /**
    * @generated
    */
    public String infoStudents() {
        String ans = "";
        for (User user : Database.users) {
            if(user instanceof Student) {
                Student st = (Student) user;
                ans += "\nStudent Name: " + st.getName()
                + "\nStudent surname: " + st.getSurname() 
                + "\nID: " + st.getId()
                + "\nYear of Study: " + st.getYear()
                + "\nFaculty: " + st.getFaculty()
                + "\nDegree: " + st.getDegree() 
                + "\n---------------------------------------------------------------\n";
            }
        }
        return ans;
    }
    /**
    * @generated
    */
    public String infoTeachers(String teacherName) {
        for (User user : Database.users) {
            if(user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if(t.getName().equals(teacherName)) {
                    return t.infoTeacher();
                }
            }
        }
        return "";
    }

    public String viewRequests() {
        return Database.studentRegistration.toString();
    }

    public String approveRegistration(String studentId, String courseId, String approve) {
        Student st = new Student();
        for(User user : Database.users) {
            if(user instanceof Student) {
                Student s = (Student) user;
                if(s.getId().equals(studentId)) {
                    st = s;
                }   
            }
        }
        Course c = new Course();
        for (Course course : Database.courses) {
            if(course.getCourseId().equals(courseId)) {
                c = course;
            }
        }

        for(HashMap.Entry<String, Course> item : Database.studentRegistration.entrySet()) {
            if(item.getKey().equals(studentId) && item.getValue().equals(c)) {
                if(approve.equals("ACCEPT")) {
                    Database.studentRegistration.remove(studentId, c);
                    st.increaseCredits(c.getCredits());
                    st.Courses.add(c);
                    return "Student's registration is accepted";
                } else if(approve.equals("REJECT")) {
                    return "Student's registration is rejected";
                }
            } else return "This order does not exist";
        }
        return "Orders does not exist";
    }
    
    public void addToDormitory(String studentId) {
        for(User user : Database.users) {
            if(user instanceof Student) {
                Student s = (Student) user;
                Database.dormStudents.add(s);
                s.setDormitoryStatus(DormitoryStatus.YES);
            }
        }
    }
    
    /**
    * @generated
    */
    public void assignCourseToTeachers(String courseId, String teacherName) {
        for (Course course : Database.courses) {
            if (course.getCourseId().equals(courseId)) {
                course.teachers.add(teacherName);
            }
        }
    }
    /**
    * @generated
    */
    public void createNews(String title, String text) {
        UniNews news = new UniNews(title, text);
        if(!Database.UniNews.contains(news)) {
            Database.UniNews.add(news);
        }
        // newsExistingException
    }
    /**
    * @generated
    */
    public Double getMaxScore() {
        Double mx = 0.0;
        for (Mark mark : Database.marks) {
            if(mark.getTotalGrade() > mx) {
                mx = mark.getTotalGrade();
            }
        }
        return mx;
    }
    /**
    * @generated
    */
    public Double getMinScore() {
        Double mn = 1000.0;
        for (Mark mark : Database.marks) {
            if(mark.getTotalGrade() < mn) {
                mn = mark.getTotalGrade();
            }
        }
        return mn;
    }
    /**
    * @generated
    */
    public Double getAvgScore() {
        Double avg = 0.0;
        int cnt = 0;
        for (Mark mark : Database.marks) {
            cnt ++;
            avg += mark.getTotalGrade();            
        }
        return avg / cnt;
    }
    /**
    * @generated
    */
    public String orderStudentsByGPA() {
        String ans = "";
        Vector<Student> s = new Vector<Student>();
        for (User user: Database.users) {
            if(user instanceof Student) {
                s.add((Student) user);
            }
        }
        s.sort(new GPASorter());
        for (User user : s) {
            Student st = (Student) user;
            ans += "Student Name: " + st.getName()
            + "\nStudent surname: " + st.getSurname() 
            + "\nGPA: " + st.getGPA()
            + "\n------------------------------\n";
        }
        return ans;
    }
    /**
    * @generated
    */
    public String orderTeachersStatus() {
        int i = 0;
        String ans = "";
        Vector<Teacher> t = new Vector<Teacher>();
        for (User user: Database.users) {
            if(user instanceof Teacher) {
                t.add((Teacher) user);
            }
        }
        t.sort(new StatusComparator());
        for (User user : t) {
            Teacher te = (Teacher) user;
            i ++;
            ans += i + "\nTeacher Name: " + te.getName()
            + "\nTeacher surname: " + te.getSurname() 
            + "\nStatus: " + te.getTeacherStatus()
            + "\nRating: " + te.getAvgRating() + "/5"
            + "\n-------------------------------------------------------------\n";
        }
        return ans;
    }
    
}
