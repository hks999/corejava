/**
 * Write a program SumOfSines.java
 * that takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
 * We use java.lang.math()
 */
import java.lang.Math;
import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)) {
            System.out.println("Please enter the angle of degrees to calculate Sin theta operations(15,30,45,60,90)");
            int b = input.nextInt();
            double c = 2 * (b);
            double d = 3 * (b);
            double a = Math.toRadians(c) + Math.toRadians(d);
            System.out.print("The output for Sin(2" + b);
            System.out.print(")" + "Sin(3)" + b);
            System.out.print(" = " + a);
        }

    }

}
