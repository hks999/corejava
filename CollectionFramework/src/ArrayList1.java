
//array list example

import java.util.ArrayList;
import java.util.Collections;

// Java program to illustrate conversion
// of an array to an ArrayList

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList I = new ArrayList();

        I.add("A");
        I.add("b");
        I.add(null);
        System.out.println(I);
        I.remove(2); //2nd index place removed
        System.out.println(I);
        I.add(2,"M"); //2nd index M element added
        System.out.println(I);
        String B[] ={"good","bad","ugly"};
        Collections.addAll(I,B);
        System.out.println(I);



    }
}
