package ReadWirteFiles;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutputStreamMethod {

    public static void start() throws IOException {
        byte[] bytes = ("Something ").getBytes();
        byte[] bytes1 = ("\nSomething\n ").getBytes();
        for (int i = 0; i < Main.SIZE; i++) {

            FileOutputStream outputStream = new FileOutputStream("file" + i);
            for (int j = 0; j < Main.SIZE / 10; j++) {
                outputStream.write(bytes);
                outputStream.write(bytes1);
            }

            outputStream.close();
        }

    }
}
