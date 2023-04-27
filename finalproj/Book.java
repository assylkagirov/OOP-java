package finalproj;

import java.util.Objects;

public class Book {

    private String title;
    private String id;

    public Book() {
        
    }

    public Book(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id);
    }


    @Override
    public String toString() {
        return "Title: " + getTitle() +
            "\nID: " + getId();
    }
    
        


}