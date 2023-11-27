import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java search <pattern> <file>");
            return;
        }

        String pattern = args[0];
        String fileName = args[1];

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
