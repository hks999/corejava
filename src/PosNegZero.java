// Write a program to check if a given number is Positive, Negative, or Zero.

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number by using either a positive, negative or zero:  ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("Entered Number is zero ");
        } else {
            if (n < 0) {
                System.out.print("Entered Number is negative ");
            } else {
                System.out.print("Entered Number is positive ");
            }
        }



    }

}
