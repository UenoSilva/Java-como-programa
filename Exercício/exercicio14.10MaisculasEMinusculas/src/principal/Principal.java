package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        
        String frase = "Meu nome é Ueno";
        
        fraseMaiscula(frase);
        fraseMinuscula(frase);
    }
    
    public static void fraseMaiscula(String frase){
        System.out.println(frase.toUpperCase());
    }
    
    public static void fraseMinuscula(String frase){
        System.out.println(frase.toLowerCase());
    }
}
