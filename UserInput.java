package userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        System.out.print("First Name:");
        Scanner fn = new Scanner(System.in);
        String answer = fn.nextLine();
        System.out.print("Last Name:");
        Scanner ln = new Scanner(System.in);
        String answer2 = ln.nextLine();
        System.out.print("Year Group:");
        Scanner yg = new Scanner(System.in);
        String answer3 = yg.nextLine();
        System.out.print("Student ID:");
        Scanner id = new Scanner(System.in);
        String answer4 = id.nextLine();
        System.out.print("Login:");
        Scanner lg = new Scanner(System.in);
        String answer5 = lg.nextLine();
        System.out.print("Predicted CS A-Level Grade:");
        Scanner pg = new Scanner(System.in);
        String answer6 = pg.nextLine();
        
        System.out.println("First Name: "+answer);
        System.out.println("Last Name: "+answer2);
        System.out.println("Year Group: "+answer3);
        System.out.println("Student ID: "+answer4);
        System.out.println("Login: "+answer5);
        System.out.println("Predicted CS A-Level Grade: "+answer6);
        
                
    }
    
}
