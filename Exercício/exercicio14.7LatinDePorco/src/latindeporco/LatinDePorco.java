package latindeporco;

/**
 *
 * @author Ueno Souza Silva
 */
public class LatinDePorco {

    private String frase;

    public LatinDePorco(String frase) {
        this.frase = frase;
    }

    private String[] tokenizacao() {
        String[] token = frase.split(" ");
        return token;
    }

    private String latinDePorco() {
        String newf = "";
        String newFrase = "";
        for(int i = 0; i < tokenizacao().length; i++){
            String f = tokenizacao()[i];
            
            char[] charArray = new char[f.length()];
            
            for(int c = 0; c < charArray.length; c++) charArray[c] = f.charAt(c);
            
            char aux = charArray[0];
            
            for(int c = 0; c < charArray.length-1; c++) charArray[c] = charArray[c+1];
            
            charArray[f.length()-1] = aux;
            
            for(int c = 0; c < charArray.length; c++) newf += charArray[c];
            
            newf += "ay";
            if(i < tokenizacao().length-1) newf += " ";
            
            newFrase += newf;
            
            newf="";
        }
          
        return newFrase;
    }

    public String printLatinDePorco() {
        
        return latinDePorco();
    }

}
