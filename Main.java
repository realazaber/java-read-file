import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File _file = new File("file.txt"); //Gets the file
        Scanner _scanner = new Scanner(_file);

        while (_scanner.hasNextLine()) { //Goes through each line and prints it out
            System.out.println(_scanner.nextLine());
        }
    }
}