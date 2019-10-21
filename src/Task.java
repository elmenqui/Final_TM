import java.util.Date;


/**
 * "Task" class holds the variables that compose a task.
 * This class is part of the "ToBe Task Manager" programme.
 * ToBe Task Manager is a simple, text based to-do-list programme
 * Tha permit the user save tasks, group them by a category and
 * assign a due date.
 *
 *
 * @author Alberto Martinez
 * @version 2019.10.15
 */

public class Task {

    private String title;
    private String category;
    private Date dueDate; // format: yyyy-mm-dd
    private boolean status;

    /**
     * @param title    The title or description of the task.
     * @param category The category which groups the task to others.
     * @param dueDate  The due date and time of the task.
     */

    public Task(String title, String category, Date dueDate, boolean status) {

        this.title = title;
        this.category = category;
        this.dueDate = dueDate;
        this.status = status;
    }

}
