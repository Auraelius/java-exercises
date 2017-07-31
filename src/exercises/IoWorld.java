package exercises;
import java.util.Scanner;

public class IoWorld {

    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name, please: ");
        name = in.next();

        System.out.println("Hello, " + name);
    }
}
