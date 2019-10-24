
import java.util.Scanner;

public class Menu {
    private final String FILE_NAME = "ToBeTM_master.csv";
    Scanner userInput = new Scanner(System.in);


    public void mainMenu() {
        System.out.println("\n");
        System.out.println("Select an option by typing its corresponding number: \n");
        System.out.println("   (1) Show Task List (by date or project)");
        System.out.println("   (2) Add New Task");
        System.out.println("   (3) Edit Task (update, mark as done, remove)");
        System.out.println("   (4) Save and Exit");
        System.out.println("\n");
        System.out.println(">>>  ");

        int selection = userInput.nextInt();
    }

}