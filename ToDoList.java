import java.io.*;
import java.util.*;
public class ToDoList implements IToDoList {
    //Data Members
    private List<Task> taskList;
    private Stack<List<Task>> history = new Stack<List<Task>>();

    public ToDoList() {
        this.taskList = null;
        this.history = null;
    }

    public void undo() {
        
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void completeTask(String id) {
        this.taskList.get(Integer.parseInt(id)).setIsCompleted(true);
    }

    public void deleteTask(String id) {
        this.taskList.remove(Integer.parseInt(id));
    }

    public void editTask(String id, String title, Boolean isCompleted) {
        this.taskList.get(Integer.parseInt(id)).setTitle(title);
        this.taskList.get(Integer.parseInt(id)).setIsCompleted(isCompleted);
    }

    public List<Task> listTasks() {
        return this.taskList;
    }
}