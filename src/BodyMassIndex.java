/**
 *  The body mass index (BMI) is the ratio of the weight of a person (in kilograms) to the square of the height (in meters).
 *  Write a program BMI.java that takes two command-line arguments, weight and height, and prints the BMI.
 */

import java.util.Scanner;
public class BodyMassIndex
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input weight in kilogram: ");
            double weight = sc.nextDouble();
            System.out.print("\nInput height in meters: ");
            double height = sc.nextDouble();
            double BMI = weight / (height * height);
            System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
        }
}

