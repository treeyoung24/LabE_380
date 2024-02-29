import java.util.Objects;

public class Task {
    private Integer id;
    private String title;
    private boolean isCompleted;

    // Constructor
    public Task(Integer id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    // Getters

    // Getter for ID
    public Integer getId() {
        return id;
    }
    
    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for isCompleted
    public boolean getIsCompleted() {
        return isCompleted;
    }

    // Setters

    // Setter for ID
    public void setId(Integer id) {
        this.id = id;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for isCompleted
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    // Copy method

    public Task copy() {
        return new Task(this.id, this.title, this.isCompleted);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
               isCompleted == task.isCompleted; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isCompleted);
    }
}
