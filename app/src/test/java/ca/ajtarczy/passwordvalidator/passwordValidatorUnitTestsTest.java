package ca.ajtarczy.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class passwordValidatorUnitTestsTest {
    public static String pw = "Example1"; //a variable to keep track of the password globally. For now it is set to a password that will pass all tests.

    @Test
    public void passwordIsNotPassword() throws Exception {
        //if password is not "password", then it passes this test.
        assertTrue(!pw.equalsIgnoreCase("password"));
    }

    @Test
    public void passwordSize() throws Exception {
        //if password is not "password", then it passes this test.
        assertTrue(!pw.equalsIgnoreCase("password"));
    }

    @Test
    public void passwordHasLowercase() throws Exception {
         /*This unit test looks at every character in the password to see if at least one character
        is lowercase. It does this by comparing the ascii value of the current character,
        and seeing if it is between the characters 'a' and 'z'.
        If any of the characters are between 'a' and 'z', and therefore lowercase,
        the test is passed. If all of the characters are not between 'a' and 'z', then it sets
        a flag to false, and the assertTrue statement at the end will resolve to false.
         */
        boolean lowerCaseFlag = false; //a flag to keep track if all the characters are lowercase or not
        int lowerBound = (int) 'a'; //keeps track of the numerical integer value of the character 'a'
        int upperBound = (int) 'z'; //keeps track of the numerical integer value of the character 'z'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is lowercase
                lowerCaseFlag = true; //set a flag to true
        }
        assertTrue(lowerCaseFlag); //this will only return true if at least one digit was not lowercase.
    }

    @Test
    public void passwordHasUppercase() throws Exception {
         /*This unit test looks at every character in the password to see if at least one character
        is uppercase. It does this by comparing the ascii value of the current character,
        and seeing if it is between the characters 'A' and 'A'.
        If any of the characters are between 'A' and 'Z', and therefore uppercase,
        the test is passed. If all of the characters are not between 'A' and 'Z', then it sets
        a flag to false, and the assertTrue statement at the end will resolve to false.
         */
        boolean upperCaseFlag = false; //a flag to keep track if all the characters are lowercase or not
        int lowerBound = (int) 'A'; //keeps track of the numerical integer value of the character 'a'
        int upperBound = (int) 'Z'; //keeps track of the numerical integer value of the character 'z'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is uppercase
                upperCaseFlag = true; //set a flag to true
        }
        assertTrue(upperCaseFlag); //this will only return true if at least one digit was not uppercase.
    }

    @Test
    public void passwordHasNumerical() throws Exception {
        /*This unit test looks at every character in the password to see if at least one character
        is uppercase. It does this by comparing the ascii value of the current character,
        and seeing if it is between the characters '0' and '9'.
        If any of the characters are between '0' and '9', and therefore uppercase,
        the test is passed. If all of the characters are not between '0' and '9', then it sets
        a flag to false, and the assertTrue statement at the end will resolve to false.
         */
        boolean numericalFlag = false; //a flag to keep track if all the characters are lowercase or not
        int lowerBound = (int) '0'; //keeps track of the numerical integer value of the character '0'
        int upperBound = (int) '9'; //keeps track of the numerical integer value of the character '9'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is numerical
                numericalFlag = true; //set a flag to true
        }
        assertTrue(numericalFlag); //this will only return true if at least one digit was not numerical.
    }

}