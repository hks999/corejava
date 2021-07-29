/**
 * Write a program to accept gender ("Male" or "Female") and age (1-120) from command
 * line arguments and print the percentage of interest based on the given conditions.
 * Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
 * Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
 * 8.3% Gender ==> Male Age ==>61-120
 */

//Enter the age and gender in the CLI.
    //Make sure Gender is first and Age next

public class GenderAgeInterestCLI {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        /*if ((args[0] == "Male") && (args[1] <= 60))
        {
            {
                System.out.println("interest is 9.2%  ");
            } else{
                System.out.println("interest is 8.3%  ");
            }
        }else {
        if (args[0] == "Female" || args[0] == "Female" && args[1] <= 60) {
            System.out.println("interest is 8.2%  ");
        } else {
            System.out.println("interest is 7.3%  ");
        }
    }


    }*/
    }}

