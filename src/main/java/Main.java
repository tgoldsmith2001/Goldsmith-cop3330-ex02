/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String Str="";
        Scanner input= new Scanner(System.in);
        System.out.print("What is the input string? ");
        //Code to ensure a string is entered before continuing to next line
        while(Str=="") {
            Str = input.nextLine();
            if(Str=="")
                System.out.print("User must input a string: ");
        }
        System.out.println(Str+" has "+Str.length()+" characters");
    }
}
