import java.io.*;
import java.util.*;
public class ToDoList implements IToDoList {
    //Data Members
    private List<Task> taskList;
    private Stack <List<Task>> history = new Stack <List<Task>>();

    public void undo() {

    }

    public void addTask(Task taskToAdd) {

    }

    public void complete() {
        
    }

    public void deleteTask(String taskNumber) {
        
    }

    public void editTask() {
        
    }

    public List<Task> listTasks() {
        return this.taskList;
    }
}