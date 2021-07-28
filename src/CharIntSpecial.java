/**
 * Intialize a character variable in a program and if the value is alphabet then print
 * "Alphabet" if it’s a number then print "Digit" and for other characters print "Special
 * Character"
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CharIntSpecial {

        public static void main(String[] args)
        {
            String str = "@Aa123";
            for (int i = 0; i < str.length(); i++)
            {
                Boolean flag = Character.isDigit(str.charAt(i));
                if (flag) {
                    System.out.println("'" + str.charAt(i) + "' is a number");
                } else {
                    System.out.println("'" + str.charAt(i) + "' is a letter");
                }
            }
                Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

                Matcher matcher = pattern.matcher(str);
                boolean ST = matcher.find();
                if(ST)
                    System.out.println(""+str+ " contains special character");
                else
                    System.out.println("" +str+ " does NOT contain special character");
            }

    }

