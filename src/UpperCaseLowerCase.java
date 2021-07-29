/**
 * * Java program to convert String from lowercase to uppercase and
 *  * uppercase to lowercase in Java. We can use toUpperCase() to convert any String
 *  * to upper case in Java and toLowerCase() method of String class to convert any
 *  * String to lower case in Java.
 *
 * Read more: https://www.java67.com/2012/12/how-to-convert-string-from-lowercase-to-uppercase.html#ixzz71fjrcVxv
 */

public class UpperCaseLowerCase {
    public static void main(String args[]) {

        //example of converting String to Upper case in Java
        //input String which contains words in lowercase
        String strInLowerCase = "this string is in lowercase";

        System.out.println("String before converting to Uppercase");
        System.out.println("input : " + strInLowerCase);

        // converting lowercase String to uppercase in Java
        String strInUpperCase = strInLowerCase.toUpperCase(); //toUpperCase return lowercase of String

        System.out.println("String after converting to Uppercase");
        System.out.println("================================================================");

        System.out.println("output : " + strInUpperCase);

        System.out.println("Now let's see an example of converting String to lower case");
        System.out.println("================================================================");

        //Now let's see an example of converting String to lower case
        String upper = "THIS IS UPPER CASE STRING";

        String lower = upper.toLowerCase(); //toLowerCase() return lowercase of String

        System.out.println("input String before converting to LowerCase : " + upper);
        System.out.println("output String after converting to LowerCase : " + lower);
    }

}



