/**
 * Write a program SumOfTwoDice.java
 * that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 */

import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 6; // generate random numbers
        int int_random = rand.nextInt(upperbound); // random value 1
        int int_rand = rand.nextInt(upperbound); // random value 2
        double double_random = rand.nextDouble();
        float float_random = rand.nextFloat();

        System.out.println(" Random integer value from 1 to "+ upperbound +":" + int_random);
        System.out.println(" Random integer value from 1 to "+ upperbound +":" + int_rand);
        System.out.println(" sum of two random values is:  "+(int_random + int_rand));

        // this statement gives the dice value of two throws of random values.

        System.out.println(" Random float value between 0.0 and 1.0 : "+float_random);
        System.out.println(" Random double value between 0.0 and 1.0 : "+double_random );


    }
}
