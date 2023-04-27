package finalproj;

import java.io.Serializable;
import java.util.Date;

/**
* @generated
*/
public class File implements Serializable {
    
    /**
    * @generated
    */
    private String fileName;
    private String courseName;
    private String description;

    public File() {
        
    }

    public File(String fileName, String courseName, String description) {
        this.fileName = fileName;
        this.courseName = courseName;
        this.description = description;
    }


    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    
}