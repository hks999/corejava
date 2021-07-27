import java.util.Scanner;

/**
 * Write a program Ordered.java that reads in three integer command line arguments, x, y, and z.
 * Create a boolean variable b that is true if the three values are either in ascending or in descending order,
 * and false otherwise. Print the variable b.
 */
import java.util.Scanner;
public class Ordered {
    public static void main(String[] args) {

        int x1,x2,x3;
        boolean b = true;
        boolean c = false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=sc.nextInt();
        System.out.println("enter y1 point");
        x2=sc.nextInt();
        System.out.println("enter x2point");
        x3=sc.nextInt();
        if (x1<=x2 && x2<=x3 && x1<=x3)
        {
            System.out.println(" numbers are in ascending order: " + b);

        } else {
            System.out.println(" numbers are in ascending order: " + c);

        }

    }
}
