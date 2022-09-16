
package principal;

import java.util.ArrayList;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        
        String frase = "Meu bom senhor, bom dia! Esses bomm bomm bow, e ai Bruno Bert";
        System.out.printf("Nova frase: %s%n", novoFrase(frase));
    }
    
    public static String novoFrase(String frase){
        
        String[] fraseSeparada = frase.split(" ");
        String fraseReformulado = "";
        
        for(int i = 0; i < fraseSeparada.length; i++){
            String nome = fraseSeparada[i];
            
            if (nome.charAt(0)== 'B' || nome.charAt(0)== 'b'){
                fraseReformulado += nome;
                fraseReformulado += " ";
            }
            
        }
        
        return fraseReformulado;
    }
    
}
