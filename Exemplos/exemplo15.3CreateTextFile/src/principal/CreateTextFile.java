package principal;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    
    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
    
    public static void openFile() {
        try {
            output = new Formatter("D:\\documentos\\NetBeansProjects\\Java como programa\\Exemplos\\exemplo15.3CreateTextFile\\src\\principal\\clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permissão de escrita negada. Terminando.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Erro ao abrir arquivo. Terminando.");
            System.exit(1);
        }
    }
    
    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        boolean aux = true;
        
        System.out.printf("%s%n%s%n? ", "Entre com número da conta, primeiro nome, último nome and saldo",
                                      "Entre com o indicar de fim-do-arquivo para inserir.");
        
        while(aux) {
            try {
                output.format("%d %s %s %.2f%n", 
                        input.nextInt(), input.next(), 
                        input.next(), input.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Erro ao escrevr no arquivo. Terminando.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Erro ao abrir arquivo. Terminando.");
                input.nextLine();
            }
            System.out.println("Deseja continuar [s/n]");
            String a = opcao.nextLine().toLowerCase().substring(0, 1);
            if ("n".equals(a))
                aux = false;
            
            System.out.print("? ");
        }
    }
    
    public static void closeFile() {
        if(output != null) 
            output.close();
    }
    
}
