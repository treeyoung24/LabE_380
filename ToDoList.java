import java.io.*;
import java.util.*;
public class ToDoList implements IToDoList {
    //Data Members
    private List<Task> taskList;
    private Stack<List<Task>> history = new Stack<List<Task>>();

    public void undo() {

    }

    public void addTask(Task task) {
        this.taskList.
    }

    public void completeTask(String id) {
        
    }

    public void deleteTask(String id) {
        
    }

    public void editTask(String id, String title, Boolean isCompleted) {
        
    }

    public List<Task> listTasks() {
        return this.taskList;
    }
}