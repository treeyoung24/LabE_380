import java.util.*;
public class ToDoList implements IToDoList {
    //Data Members
    private List<Task> taskList = new ArrayList<Task>();
    private Stack<List<Task>> history = new Stack<List<Task>>();

    public void undo() {
        pushStack();
        //Gets the most recent edit on the taskList and sets the list equal to
        //The most recent edit done to the list of tasks
        this.taskList = history.get(0); 
    }

    public void addTask(Task task) {
        pushStack();
        this.taskList.add(task);
    }

    public void completeTask(String id) {
        pushStack();
        this.taskList.get(Integer.parseInt(id) - 1).setIsCompleted(true);
    }

    public void deleteTask(String id) {
        pushStack();
        this.taskList.remove(Integer.parseInt(id) - 1);
    }

    public void editTask(String id, String title, Boolean isCompleted) {
        pushStack();
        this.taskList.get(Integer.parseInt(id) - 1).setTitle(title);
        this.taskList.get(Integer.parseInt(id) - 1).setIsCompleted(isCompleted);
    }

    public List<Task> listTasks() {
        return this.taskList;
    }

    public void pushStack() {
        history.push(this.taskList);
    }
}