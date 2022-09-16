
package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        
        String frase = "    aed meued mais ueno souza sed boy boyed   ".toUpperCase().trim();
        System.out.println("Frase: " + frase);
        System.out.println("Novo frase: " + novaFrase(frase));
        
    }
    
    public static String novaFrase(String frase){
        
        String[] fraseSeparada = frase.split(" ");
        String f = "";
        
        for(int i = 0; i < fraseSeparada.length; i++){
            String n = fraseSeparada[i];
            if (n.substring(n.length()-2, n.length()).equals("ED")){
                f += fraseSeparada[i];
                f += " ";
            }
        }
        return f;
    }
}
