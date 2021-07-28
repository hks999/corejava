/**
 * Area of a triangle. Write a program TriangleArea.java that takes three command line inputs a, b, and c,
 * representing the side lengths of a triangle,
 * and prints the area of the triangle using Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)), where s = (a + b + c) / 2.
 */

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input the side of a :");
            int a = input.nextInt();
            System.out.println("Input the side of b :");
            int b = input.nextInt();
            System.out.println("Input the side of b :");
            int c = input.nextInt();
            System.out.println("==============Heron's formula: area = sqrt(s(s-a)(s-b)(s-c))==============, ");
            System.out.println("==============   where s = (a + b + c) / 2  ============");
            int s = (a + b + c) / 2;
            System.out.println("The calculated S for the given sides a,b,c is : " + s);
            double f = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
            System.out.println("Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)) output is:  " + f);



        }
    }
}
