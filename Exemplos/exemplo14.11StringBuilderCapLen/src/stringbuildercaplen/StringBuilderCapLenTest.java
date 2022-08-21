package stringbuildercaplen;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringBuilderCapLenTest {

    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("Hello, how are you?");
        
        System.out.printf("builder = %s%nlength = %s%ncapacity = %d%n%n", 
                builder.toString(), builder.length(), builder.capacity());
        
        builder.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", builder.capacity());
        
        builder.setLength(10);
               
        System.out.printf("New length = %d%nbuilder = %s%n", builder.length(), builder.toString());
    }
    
}
