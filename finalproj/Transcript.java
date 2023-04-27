package finalproj;

/**
* @generated
*/
public class Transcript {
    
    private double GPA;

    public Transcript() {
    }
    
    public Transcript(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void calculateGPA(Student st) {
        //TODO
        double allPoints = 0.0;
        int cnt = 0;
		for (Mark mark : Database.marks) {
        	if(mark.getStudentId().equals(st.getId())) {
                    allPoints += mark.getTotalGrade();
                    cnt++;
                }
            }
            allPoints /= cnt;
        }
    /**
    * @generated
    */
    /**
     * @generated
     */
     public String convertGPA(Double totalGrade) {
         if (totalGrade >= 95 && totalGrade <= 100)return "4.0"; 
         else if (totalGrade >= 90)return "3.67"; 
         else if (totalGrade >= 85)return "3.33"; 
         else if (totalGrade >= 80)return "3.0";    
         else if (totalGrade >= 75)return "2.67"; 
         else if (totalGrade >= 70)return "2.33"; 
         else if (totalGrade >= 65)return "2.0"; 
         else if (totalGrade >= 60)return "1.67"; 
         else if (totalGrade >= 55)return "1.33"; 
         else  if (totalGrade >= 50) return "1.00"; 
         else  return "0.0";
     }
     
    
}