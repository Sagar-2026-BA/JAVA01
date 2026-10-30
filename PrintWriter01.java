import java.io.PrintWriter;

public class PrintWriter01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Tech");
        try (PrintWriter writer = new PrintWriter("testout.txt")) {
            writer.write("Line Java, Spring, Android, PHP, etc");
        }
    }
}
