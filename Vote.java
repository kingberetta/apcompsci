//Assign a door code (2772) to a door and print enter if correct//
// Write a program that determines if a user can vote or not. Voting age is 18//
import java.util.Scanner;

class Vote{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("How old are you gang?");
        int age = scn.nextInt();
        if(age >= 18){
            System.out.println("Congratulations, you are able to vote!");
        } else {
            System.out.println("You are ineligible to vote.");
        }
        
        scn.close();
    }
}
