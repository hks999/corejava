/**
 * Write a program to print month in words, based on input month in numbers
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month in number");
        int Month = sc.nex!https://github.com/hks999/corejava.git tInt();
        try {
        }catch (InputMismatchException e) {
            System.err.println("Number must be an integer." + e);

        }
            if (Month <= 12) {
                switch (Month) {
                    case 1:
                        System.out.println("Jan");
                        break;
                    case 2:
                        System.out.println("Feb");
                        break;
                    case 3:
                        System.out.println("Mar");
                        break;
                    case 4:
                        System.out.println("Apr");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("Jun");
                        break;
                    case 7:
                        System.out.println("Jul");
                        break;
                    case 8:
                        System.out.println("Aug");
                        break;
                    case 9:
                        System.out.println("Sep");
                        break;
                    case 10:
                        System.out.println("Oct");
                        break;
                    case 11:
                        System.out.println("Nov");
                        break;
                    case 12:
                        System.out.println("Dec");
                        break;


                }
            }else{
                    System.out.println("Please enter a valid number");

                }
            }

            }



