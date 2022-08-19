package ReadWirteFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMethod {

    public static void start() throws IOException {
        for (int i = 0; i < Main.SIZE; i++) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file" + i));

            for (int j = 0; j < Main.SIZE / 10; j++) {
                writer.write("Something " + j);
                writer.write("\nSomething\n " + i);
            }

            writer.close();
        }

    }
}
