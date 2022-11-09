package principal;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    
    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }
    
    // abre o arquivo clients.txt
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("D:\\documentos\\NetBeansProjects\\Java como programa\\Exemplos\\exemplo15.6ReadTextFile\\src\\arquivos\\clientes.txt"));
        } catch (IOException iOException) {
            System.out.println("Error ao abrir arquivo. Terminando");
        }
    }
    
    // lê o registro no arquivo
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Saldo");
        try {
            while(input.hasNext()) {
                System.out.printf("%-10s%-12s%-12s%10s%n", 
                        input.nextInt(), input.next(), input.next(), input.nextFloat());
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Arquivo com formado errado. Terminando.");
        } catch (IllegalStateException illegalStateException) {
            System.out.println("Error ao ler arquivo. Terminando.");
        }
    }
    
    public static void closeFile() {
        if(input != null)
            input.close();
    }
    
}
