package ca.ajtarczy.passwordvalidator;

public class Validator{

    public static int validate(String pw) {
        if (pw == "")
            return 0;
        else {
            int sum = passwordIsNotPassword(pw) + passwordHasLowercase(pw)
                    + passwordHasNumerical(pw) + passwordHasUppercase(pw)
                    + passwordSize(pw);
            return sum;
        }
    }

    public static int passwordIsNotPassword(String pw){
        //if password is not "password", then it passes this test.
        if (!pw.equalsIgnoreCase("password"))
            return 1;
        else
            return 0;
    }

    public static int passwordSize(String pw) {
        //if password is not "password", then it passes this test.
        if (pw.length() >= 8)
            return 1;
        else
            return 0;
    }

    public static int passwordHasLowercase(String pw){
        //this method checks to see if the password contains at least 1 lowercase character
        boolean lowerCaseFlag = false; //a flag to keep track if any of the characters are lowercase or not
        int lowerBound = (int) 'a'; //keeps track of the numerical integer value of the character 'a'
        int upperBound = (int) 'z'; //keeps track of the numerical integer value of the character 'z'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is lowercase
               return 1;
        }
        return 0;

    }

    public static int passwordHasUppercase(String pw) {
        //this method checks to see if the password contains at least 1 uppercase character
        int lowerBound = (int) 'A'; //keeps track of the numerical integer value of the character 'a'
        int upperBound = (int) 'Z'; //keeps track of the numerical integer value of the character 'z'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is uppercase
                return 1;
        }
        return 0;
    }


    public static int passwordHasNumerical(String pw){
        //this methods checks if the password has at least 1 number
        int lowerBound = (int) '0'; //keeps track of the numerical integer value of the character '0'
        int upperBound = (int) '9'; //keeps track of the numerical integer value of the character '9'
        for (int i=0; i<pw.length(); i++){ //loops through every character in the password
            char currentChar = pw.charAt(i); //sets the current character being looked at to the ith character in the password
            if (currentChar >= lowerBound && currentChar <= upperBound) //sees if the current character is numerical
               return 1;
        }
        return 0;
    }





}
