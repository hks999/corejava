
/**
 * Write a program SpringSeason.java that takes two int values m and d from the command line
 * and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
 */
import java.util.Scanner;
import java.lang.System;

public class SpringSeason {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the Day from 1 to 31 of the year");
            int d = input.nextInt();
            System.out.println("Please enter the Month from 1 to 12 of the year");
            int m = input.nextInt();

            if(m >= 3 && m <= 6) {

                if (m == 3 && d >= 20 && d <= 31) {
                    System.out.println("its in spring");
                     } else {
                    System.out.println("its not Spring");
                }

                if (m == 4 && d >= 1 && d <= 30) {
                    System.out.println("its in spring");
                } else {
                    System.out.println("its not Spring");
                }
                if (m == 5 && d >= 1 && d <= 31) {
                    System.out.println("its in spring");
                } else {
                    System.out.println("its not Spring");
                }
                if (m == 6 && d >= 1 && d <= 20) {
                    System.out.println("its in spring");
                } else {
                    System.out.println("its not Spring");
                }
            }else{
                System.out.println("its not Spring");
            }
        }


    }
}

