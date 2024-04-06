import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileexception {
    public static void main(String[] args) {
        try {
            //file path
            String filePath = "C:\\Users\\HP\\Desktop\\Rogith\\dharaneesh\\FINAL YEAR PROJECT\\guvi\\task-11\\ dk.txt";
            
            // Create an object
            File file = new File(filePath);
            
            // if the file exists
            if (!file.exists()) {
                // throw a FileNotFoundException
                throw new FileNotFoundException("File not Found Exception");
            }
            
            // Read data from the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // error message to the user
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
 * OUTPUT
 * Error: File not Found Exception
 */