/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticharmethods2;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class StaticCharMethods2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter radix");
        int radix = scanner.nextInt();
        
        System.out.printf("Please choose one:%n  1 -- %s%n  2 -- %s%n", 
                "Convert digit to chacater", "Convert characte to digit");
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter a digit");
                int digit = scanner.nextInt();
                System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.println("Enter a character");
                char character = scanner.next().charAt(0);
                System.out.printf("Convert character to digit: %s%n", Character.digit(character, radix));
                break;
        }
        
    }
    
}
