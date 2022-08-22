package ReadWirteFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadWithScanner {

    public static void start() throws IOException {
        for (int i = 0; i < Main.SIZE; i++) {
            Scanner scanner = new Scanner(new File("file" + i));
            String line = scanner.nextLine();
            while (scanner.hasNextLine()){
                line.toLowerCase();
                line = scanner.nextLine();
            }
            scanner.close();
        }

    }
}
