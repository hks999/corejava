/**
 * Fibonacci word. Write a program FibonacciWord.java
 * that prints the Fibonacci word of order 0 through 10. f(0) = "a", f(1) = "b", f(2) = "ba", f(3) = "bab", f(4) = "babba",
 * and in general f(n) = f(n-1) followed by f(n-2). Use string concatenation
 */
import java.util.*;

public class Fibbonnaci{
/*{
// this gives the final output.
    static int fib(int n)
        {
            if (n <= 1)
            return n;
            return fib(n - 1) + fib(n - 2);
        }

    public static void main(String[] args)
    {
        int n = 9;
        System.out.println(fib(n));

    }*/
   /*
   // This program illustrates the number sequence
   public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        }

    }*/



        private String x, y, z;
        private int n;
        public Fibbonnaci()
        {
             x = "a";
             y = "b";
             z = "ba";
        }
        public void accept (){
            Scanner sc = new Scanner( System.in );
            System.out.print( "Enter number of terms: ");
            n = sc.nextInt();
        }
        public void generate (){
            if( n == 1 ){
                System.out.print ( x );
            }else if( n==2 ){
                System.out.print ( x + " " + y );
            }else{
                System.out.print ( x + " " + y + " ");
                for( int i = 1; i <= (n-2) ; i++ ){
                    z = y + x;
                    System.out.print ( z + " ");
                    x=y;
                    y=z;
                }
            }
            System.out.println ();
        }
        public static void main ( String args[] ){
            Fibbonnaci fs = new Fibbonnaci();
            fs.accept();
            fs.generate();
        }
    }





