/**
 * Write a program that takes four real-valued command line parameters x1, y1, x2, and y2 and
 * prints the Euclidean distance between the points (x1, y1) and (x2, y2). Use Math.sqrt().**
 *
 */

import java.util.Scanner;
public class EuclideanDistance {


        public static void main(String arg[])

        {
            int x1,x2,y1,y2;
            double dis;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter x1 point");
            x1=sc.nextInt();
            System.out.println("enter y1 point");
            y1=sc.nextInt();
            System.out.println("enter x2point");
            x2=sc.nextInt();
            System.out.println("enter y2 point");
            y2=sc.nextInt();
            dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("Ecludian distance between "+"("+x1+","+y1+"),"+"("+x2+","+y2+") ===> "+dis);

        }

    }

