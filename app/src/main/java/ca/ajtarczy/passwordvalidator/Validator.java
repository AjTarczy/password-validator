package ca.ajtarczy.passwordvalidator;

/**
 * Created by Aj Tarczy on 2/7/2018.
 */

public class Validator {

    public static int validate(string password){
        /*
        so the idea of this method is, given a password, it runs the password against a set of tests i define and
        returns the amount of tests passed.
        how i wana do this is:
        for each character in password, loop through each character
        check the ith character against all of the rules (likely defined as if statements)
        in each of those if statements, if the character passes that specific rule, set a flag for that rule to true.
        when the loop breaks, add the boolean values of the flags together (0 for fail, 1 for pass)
        and it should compare that value to the amount of test cases, and change the text on the textfield
        according to how many test cases it passes.
        1 -> very bad
        2 -> bad
        3 -> acceptable
        4 -> good
        5 -> very good
        */
        boolean pwFlag = false; //keeps track of the password flag for the password
        boolean sizeFlag = false; //keeps track of the size flag for the password
        int result = 0; //is used to compute the amount of tests passed

        if (!password.equalsIgnoreCase("password")) //password flag
            pwFlag = true;


        if (password.length() >=8) //size flag
           sizeFlag = true;

        result += (sizeFlag) ? 1:0; //adds a value of 1 to result if the size flag was true, 0 if false
        result += (pwFlag) ? 1:0; //adds a value of 1 to result if the size flag was true, 0 if false
        return (result); //returns the total number of tests passed
    }







}
