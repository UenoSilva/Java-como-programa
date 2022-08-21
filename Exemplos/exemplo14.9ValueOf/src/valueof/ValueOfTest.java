package valueof;

/**
 *
 * @author Ueno Souza Silva
 */
public class ValueOfTest {

    public static void main(String[] args) {
        
        char[] charArray = {'a','b','c','d','e','f'};
        boolean booleanValue = true;
        char charValue = 'z';
        int integerValue = 7;
        long longValue = 1000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        Object objectValue = "hello";
        
        System.out.printf("char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n", String.valueOf(charArray, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf("char = %s%n", String.valueOf(charValue));
        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n", String.valueOf(floatValue));
        System.out.printf("double = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object = %s%n", String.valueOf(objectValue));
    }
    
}
