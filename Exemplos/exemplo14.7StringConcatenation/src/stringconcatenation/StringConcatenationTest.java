package stringconcatenation;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringConcatenationTest {

    public static void main(String[] args) {
        
        String s1 = "Happy ";
        String s2 = "Birthday";
        
        System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 after concatenation = %s%n", s1);
        System.out.printf("s2 after concatenation = %s%n", s2);
    }
    
}
