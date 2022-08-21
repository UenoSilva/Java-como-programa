package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {
        String numero = "(555) 555-5555";
        String[] dados = new String[3];
        
        String DD;
        
        String[] dd = numero.split("\\(", 2);
        dd = dd[1].split("\\)", 2);
        
        String ddComp = dd[0];
        
        String[] num = dd[1].split(" ", 2);
        num = num[1].split("-");
        
        String numeroComp = num[0]+num[1];
        
        System.out.println(ddComp +  " " + numeroComp);
        
        
    }
    
}
