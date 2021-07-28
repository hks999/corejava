/**
 * Initialize two character variables in a program and display the characters in alphabetical
 * order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
 * second is e O/P:a,e
 */
// without for statement the logic is lengthy and I used only if to shorten the time

import java.util.Arrays;
import java.util.Scanner;
public class CharOP
{
        public static void main(String args[])
        {
            int temp, size;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string value: ");
            String str = sc.nextLine();
            char charArray[] = str.toCharArray();
            size = charArray.length;
            for(int i = 0; i < size; i++ ) {
                for(int j = i+1; j < size; j++) {
                    if(charArray[i]>charArray[j]) {
                        temp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = (char) temp;
                    }
                }
            }
            System.out.println("Sorted string letter "+Arrays.toString(charArray));

        }
    }