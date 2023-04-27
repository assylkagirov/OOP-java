package finalproj;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

/**
* @generated
*/
public class UniNews implements Serializable {
    
    private String title;
    private String text;
    private Vector<String> comments;

    public UniNews(String title, String text) {
        this.title = title;
        this.text = text;
        this.comments = new Vector<String>();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Vector<String> getComments() {
        return this.comments;
    }

    public void setComments(Vector<String> comments) {
        this.comments = comments;
    }
   
    
    //                          Operations                                  
    
    /**
    * @generated
    */
    public String getUniNewsInfo() {
        String s = "";
        for (UniNews i: Database.UniNews){
            s += i.title + "\n" + i.text 
            + "\n-----------------------------------------------\n";
        }
        return s;
    }
    
}