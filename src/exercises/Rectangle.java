package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Float height, width, area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the rectangle's height: ");
        height = in.nextFloat();
        System.out.println("Enter the rectangle's width: ");
        width = in.nextFloat();
        area = width * height;

        System.out.println("This rectangle is " + height + " in height,");
        System.out.println( width + " in width, and has an area of " + area);
    }
}
