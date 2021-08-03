//Array list using for loop. Funny thing is Integer is stricked out and it still works.

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList2 {
            public static void func1(int arr[])
        {
            ArrayList<Integer> array_list =
                    new ArrayList<Integer>();

            // Using add() method to add elements in array_list
            for (int i = 0; i < arr.length; i++)
                array_list.add(new Integer(arr[i]));
            System.out.print(array_list);
        }

        public static void main(String[] args)
        {

            int array[] = { 1, 2, 3, 4, 5 };
            func1(array);
        }
    }

