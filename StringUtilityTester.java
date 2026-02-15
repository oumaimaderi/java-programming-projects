
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Oumaima Deri
 */
import java.util.Scanner;

public class StringUtilityTester {

    StringUtilityTester(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.print("Is " + s + " a palindrome? ");
        System.out.println(StringUtility.isPalindrome(s) ? "Yes" : "No");

        System.out.println("Enter file name followed with an extension");
        s = in.nextLine();
        System.out.println("File name = " + StringUtility.fileName(s));
        System.out.println("File extension = " + StringUtility.fileExtension(s));

        System.out.println(StringUtility.countMe("WELCOME TO JAVA", 'e'));
        System.out.println(StringUtility.countMe("  Welcome To Java   ", 'j'));
        System.out.println(StringUtility.countMe(" Welcome To Java ", 'b'));

        System.out.println(StringUtility.isValidPassword("AbcdeFG12!"));
        System.out.println(StringUtility.isValidPassword("AbC1"));
        System.out.println(StringUtility.isValidPassword("asdfGH12"));
    }

    public static void main(String[] args) {
        new StringUtilityTester();
    }
}
