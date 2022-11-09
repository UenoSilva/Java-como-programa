/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class FileAndDirectoryInfo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o caminho do arquivo ou diretório: ");
        
//        String c = ;
        
        Path path = Paths.get(input.nextLine());
        
        if (Files.exists(path)) {
            System.out.printf("%n%s existi%n", path.getFileName());
            System.out.printf("%s um diretório%n", Files.isDirectory(path) ? "É" : "Não é");
            System.out.printf("%s um path absolute%n", path.isAbsolute() ? "É" : "Não é");
            System.out.printf("Última modificacação %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            
            if(Files.isDirectory(path)) {
                System.out.printf("%nDiretório contém:%n");
                
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                
                for(Path p : directoryStream) {
                    System.out.println(p);
                }
            }
        }
        else {
            System.out.printf("%s não existi path", path);
        }
        
    }
    
}
