/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconstructors;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringConstructorTest {

    public static void main(String[] args) {
        
        char[] chararray = {'u','e','n','o',' ','s','o','u','z','a',' ','s','i','l','v','a'};
        String s = new String("e ai bro");
        
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(chararray);
        String s4 = new String(chararray, 5, 5);
        
        System.out.printf("s1= %s%ns2= %s%ns3= %s%ns4= %s%n",s1,s2,s3,s4);
    }
    
}
