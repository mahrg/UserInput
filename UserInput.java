package userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        System.out.print("First Name:");
        Scanner fn = new Scanner(System.in);
        String answer = fn.nextLine();
        System.out.print("Last Name:");
        String answer2 = fn.nextLine();
        System.out.print("Year Group:");
        String answer3 = fn.nextLine();
        System.out.print("Student ID:");
        String answer4 = fn.nextLine();
        System.out.print("Login:");
        String answer5 = fn.nextLine();
        System.out.print("Predicted CS A-Level Grade:");
        String answer6 = fn.nextLine();
        
        System.out.println("First Name: "+answer);
        System.out.println("Last Name: "+answer2);
        System.out.println("Year Group: "+answer3);
        System.out.println("Student ID: "+answer4);
        System.out.println("Login: "+answer5);
        System.out.println("Predicted CS A-Level Grade: "+answer6);
        
                
    }
    
}
