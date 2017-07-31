package exercises;
import java.util.Scanner;


public class Mpg {
    public static void main(String[] args) {
        Float miles, gallons, milesPerGallon;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How long was your road, traveller? : ");
        miles = in.nextFloat();
        System.out.println("How thirsty was your ride? : ");
        gallons = in.nextFloat();
        milesPerGallon = miles  / gallons;

        System.out.println("After " + miles + " long, laborious miles and " + gallons + " gallons of fuel,");
        System.out.println("That car of yours is getting " + milesPerGallon + " MPG.");
    }

}
