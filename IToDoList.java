import java.util.List;

interface IToDoList {

    // Task Management
    void addTask(Task task);
    List<Task> listTasks();
    void completeTask(String id);
    void deleteTask(String id);
    void editTask(String id, String title, Boolean isCompleted);
    void undo();

}