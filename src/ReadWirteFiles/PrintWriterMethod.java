package ReadWirteFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMethod {



    public static void start() throws IOException {
        for (int i = 0; i < Main.SIZE; i++) {

            PrintWriter printWriter = new PrintWriter(new FileWriter("file" + i));

            for (int j = 0; j < Main.SIZE / 10; j++) {
                printWriter.print("Something " + j);
                printWriter.print("\nSomething\n " + i);
            }

            printWriter.close();
        }

    }

}
