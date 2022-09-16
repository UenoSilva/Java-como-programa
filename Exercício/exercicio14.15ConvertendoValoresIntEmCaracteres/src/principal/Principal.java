package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Código  Caractere");
        for(int i = 1; i <= 255; i++){
            char ascii = (char) i;
            System.out.printf("%03d %5c%n", i, ascii);
        }
    }
    
}
