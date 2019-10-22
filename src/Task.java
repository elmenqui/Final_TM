import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * "Task" class holds the variables that compose a task.
 * This class is part of the "ToBe Task Manager" programme.
 * ToBe Task Manager is a simple, text based to-do-list programme
 * Tha permit the user save tasks, group them by a category and
 * assign a due date.
 *
 * @author Alberto Martinez
 * @version 2019.10.15
 */

public class Task {

    private String title;
    private String category;
    private String dueDate; // format: yyyy-mm-dd
    private String status;

    /**
     * @param title    The title or description of the task.
     * @param category The category which groups the task to others.
     * @param dueDate  The due date and time of the task.
     * @param status   Sets the task as ongoing (true) or done (false)
     */

    public Task(String title, String category, String dueDate, String status) {

        this.title = title;
        this.category = category;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() throws ParseException {
        Date date;
        date = new SimpleDateFormat("dd/MM/yyyy").parse(dueDate);
        return date;
    }

    public boolean isStatus() {
        boolean parseBoolean = Boolean.parseBoolean(status);
        return parseBoolean;
    }

}
