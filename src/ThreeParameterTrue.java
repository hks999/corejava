/**
 * Write a program that reads in three parameters and prints true if all three are equal, and false otherwise.
 */

import java.util.Scanner;
public class ThreeParameterTrue
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner (System.in))
        {
            System.out.println("Please enter the first fruit name");
            String fruit1 = input.next();
            System.out.println("Please enter the first fruit name");
            String fruit2 = input.next();
            System.out.println("Please enter the first fruit name");
            String fruit3 = input.next();
            System.out.println("Checking fruit1=fruit2: " +fruit1.equals(fruit2));
            System.out.println("Checking fruit2=fruit3: "+fruit2.equals(fruit3));
            System.out.println("Checking fruit3=fruit1: " +fruit3.equals(fruit1));
        }


    }
}
