/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Oumaima Deri
 */
public class StringUtility {

    /*
    A utility method that helps to create a new string that is the reversal of str
    */
    static String reverse(String str){
        String reversal = "";
        int length = str.length();
        for(int i = length - 1; i >= 0; i--){ //begin from the end and stop at the start of str to reverse it
            reversal += str.charAt(i);  //append to reversal as we read the characters at index i
        }
        return reversal;
    }

    static boolean isPalindrome(String str){
        String reversal = reverse(str);
        //compares if the reversal is the same as the original string
        return str.equals(reversal);
        //OR, just one statement
        //return str.equals(reverse(str));
    }

    /*
    A utility method that helps me get the file extension
    */
    static String fileExtension(String fileName){
        int dot = fileName.lastIndexOf('.'); //find the position of last period
        return fileName.substring(dot + 1); //return a substring beginning from index after period to the end.
    }

    /* 
    A utility method that helps me get the file name without extension
    */
    static String fileName(String file){
        int dot = file.indexOf('.'); //I need to find the position of period
        return file.substring(0, dot);  //return a substring from beginning to the index before period
    }

    /*
    A utility method that counts how many times a character appears in a string
    */
    static int countMe(String str, char ch){

        int count = 0;

        // make comparison 
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }

        if(count == 0){
            return -1;
        }

        return count;
    }

    /*
    A utility method that checks if a password is valid
    */
    static boolean isValidPassword(String password){

        // remove spaces from password
        password = password.replaceAll("\\s", "");

        // password must be at least 8 characters
        if(password.length() < 8){
            return false;
        }

        int digitCount = 0;
        int specialCharCount = 0;

        char[] chars = password.toCharArray();

        for(char ch : chars){

            if(Character.isDigit(ch)){
                digitCount++;
            }
            else if(!Character.isLetterOrDigit(ch)){
                specialCharCount++;
            }
        }

        if(digitCount >= 2 && specialCharCount >= 1){
            return true;
        }

        return false;
    }

    //  main method for testing
    public static void main(String[] args){

        System.out.println(countMe("WELCOME TO JAVA", 'e'));      // 2
        System.out.println(countMe("  Welcome To Java   ", 'j')); // 1
        System.out.println(countMe(" Welcome To Java ", 'b'));    // -1

        System.out.println(isValidPassword("AbcdeFG12!")); // true
        System.out.println(isValidPassword("AbC1"));       // false
        System.out.println(isValidPassword("asdfGH12"));   // false
    }
}
