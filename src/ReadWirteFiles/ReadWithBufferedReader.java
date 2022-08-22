package ReadWirteFiles;

import java.io.*;

public class ReadWithBufferedReader {


    public static void start() throws IOException {
        for (int i = 0; i < Main.SIZE; i++) {
            BufferedReader reader = new BufferedReader(new FileReader("file" + i));
            String line;
            while ((line = reader.readLine()) != null ){
                line.toLowerCase();
            }
            reader.close();
        }

    }
}
