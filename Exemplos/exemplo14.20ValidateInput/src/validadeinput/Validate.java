/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadeinput;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class Validate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine(); 
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();
        
        System.out.println("\nValidate result\n");
        
        if(!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if(!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if(!ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if(!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if(!ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if(!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip");
        else if(!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone");
        else
            System.out.println("Valid input.   Thank you.");
    }
    
}
