/**
 *
 *  * Write a program to check if the program has received command line arguments or not.
 *  * If the program has not received the values then print "No Values", else print all the
 *  * values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
 *  * java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
 *  * property of an array to check its length
 */



 public class CLI
{

        public static void main (String[] args)
        {

            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
            int arrayLength1 =  args[0].length();
            int arrayLength2 =  args[1].length();
            int arrayLength3 =  args[2].length();
            System.out.println("Length 1 is "+ arrayLength1);
            System.out.println("Length 2 is "+ arrayLength2);
            System.out.println("Length 3 is "+ arrayLength3);

        }
}



