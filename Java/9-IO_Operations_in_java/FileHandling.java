import java.io.*;
import java.io.FileWriter;

public class FileHandling {
    public static void main() throws IOException {
        // writing in files - 
        FileWriter writer = new FileWriter("output.txt");
        writer.write("This is a test file.\nJava File I/O.");
        writer.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        bufferedWriter.write("Hello, Java!");
        bufferedWriter.newLine();
        bufferedWriter.write("File writing done.");
        bufferedWriter.close();

        // reading from file 
        FileReader reader = new FileReader("example.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();

        // reading from BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }
}
