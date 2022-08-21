package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        
        String frase = "Meu nome é ueno";
        
        System.out.println(fraseInveritada(frase));
    }
    
    public static String fraseInveritada(String frase){
        
        String[] arrayPalavras = frase.split(" ");
        String novaFrase = null;
        String p = "";
        
        for(int i = 0; i < arrayPalavras.length; i++){

            for(int j = arrayPalavras[i].length()-1; j >= 0; j--){
                p += arrayPalavras[i].charAt(j);
            }
            p += " ";
            novaFrase = p;
        }
        return novaFrase;
    }
    
}
