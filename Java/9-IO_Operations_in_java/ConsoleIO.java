import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.GraphicsEnvironment;


public class ConsoleIO{

    public static void main(String[] args) throws IOException {
        // using Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();
        
        // using BufferedReader + InputStreamReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        // using Console Class
        Console console = System.console();
        String className = null;
        if (console != null) {
            System.out.println("using console !");
            className = console.readLine("Enter your class: ");
        } else {
            // fallback if console is not available (e.g., in IDEs)
            System.out.print("Enter your class: ");
            className = reader.readLine();
        }
        
        // using JOptionPane
        String teamName = null;
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("GUI not supported in this environment.");
        } else {
            teamName = JOptionPane.showInputDialog("Enter favourite team:");
        }
        // using System.out 
        System.out.println("Hello, " + name);
        System.out.println("your age: " + age);

        // using BufferedWriter + OutputStreamWriter
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("Printed via BufferedWriter");
        writer.newLine();
        writer.flush();

        // using console class
        if (console != null) {
            console.writer().println("Your class is: " + className);
        } else {
            System.out.println("Your class is: " + className);
        }

        // JOptionPane
        JOptionPane.showMessageDialog(null, "Hello, " + name + "! You like " + teamName + ".");
    }
}