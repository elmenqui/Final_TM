import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Simple CSV reader that reads a file and places the fields into a list
 */

class TaskFileReader {

    /**
     * @return a List with the content of the CSV by Line
     * @throws Exception when filepath is not correct
     */

    List<Task> readCsvFile() throws Exception {

        List<Task> taskList = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new java.io.FileReader("Final_TM/resources/"));
        } catch (FileNotFoundException e) {
            System.out.println("The correct file was not found");
            e.printStackTrace();
        }
        String line = null;
        while (true) {
            try {
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] lineContents = line.split("§");
            Task taskFromFile = new Task(lineContents[0], lineContents[1], lineContents[2], lineContents[3]);
            taskList.add(taskFromFile);
        }
        return taskList;
    }

}