import java.io.*;
import java.util.*;
public class ToDoList implements IToDoList {
    //Data Members
    private List<Task> taskList;
    private Stack<List<Task>> history;

    public ToDoList() {
        this.taskList = null;
        this.history = null;
    }

    public void undo() {
        taskList = history.pop();
    }

    public void addTask(Task task) {
        history.push(taskList);
        this.taskList.add(task);
    }

    public void completeTask(String id) {
        for (Task task: taskList) {
            if (Objects.equals(task.getId(), id)) {
                task.setIsCompleted(true);
            }
        }
    }

    public void deleteTask(String id) {
        taskList.removeIf(task -> Objects.equals(task.getId(), id));
    }

    public void editTask(String id, String title, Boolean isCompleted) {
        history.push(taskList);
        for (Task task: taskList) {
            if (Objects.equals(task.getId(), id)) {
                task.setTitle(title);
                task.setIsCompleted(isCompleted);
            }
        }
    }

    public List<Task> listTasks() {
        return this.taskList;
    }
}