/**
 * Barring overflow, give a code fragment to compute the maximum of two integers a and b without using Math.max() or if.
 */


import java.util.Scanner;

public class IntMax {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in))
        {
            System.out.println(" Please input a number A :");
            int a = input.nextInt();
            System.out.println(" Please input a number A :");
            int b = input.nextInt();
            int max = (a + b + Math.abs(a - b)) / 2;
            System.out.println(" Maximum number is:" + max);


        }
    }
}
