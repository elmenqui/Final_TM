
/**
 * ToBeList is a very simple, text based to-do-list programme.
 *
 * Main initiates the programme
 *
 * @author Alberto Martinez
 * @version 2019.10.22
 */

public class Main {

    private static Menu menu = new Menu();

    public static void main(String[] args) {
        System.out.println("####################################################");
        System.out.println("##                   >> Tobe <<                   ##");
        System.out.println("##         >> The Ultimate Task Manager <<        ##");
        System.out.println("####################################################");
        menu.mainMenu();
    }
}

