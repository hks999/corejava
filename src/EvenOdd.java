/* Write a program to check if a given number is odd or even. */
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int n = sc.nextInt();
        if (n/2 == 0) {
            System.out.print("Entered number is even  ");
        } else {
            System.out.print("Entered number is odd  ");
        }
    }
}
