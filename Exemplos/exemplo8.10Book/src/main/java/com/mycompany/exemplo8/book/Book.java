// Exemplo 8.10: book.java
// Declarando um tipo enum com construtores e campos de instâncias explícitos
// e métodos de acesso para esses campos

package com.mycompany.exemplo8.book;

/**
 *
 * @author Ueno Souza Silva
 */
public enum Book {
    
    //constantes do tipo enum
    JHTP("Java How to program", "2015"),
    CHTP("C How to program", "2013"),
    IW3HTP("Intert & World Wide Web How to program", "2012"),
    CPPHTP("C++ How to program", "2014"),
    VBHTP("Visual Basic How to program", "2014"), 
    CSHARPHTP("Visual C# How to program","2014");
    
    //variáveis de instância 
    private final String title; // título do livro
    private final String copyrightYear; // ano dos direitos autorais
    
    //constutor enum
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    //acessor o título do livro
    public String getTitle() {
        return title;
    }
    
    //acessor para o campo de copyright
    public String getCopyrightYear() {
        return copyrightYear;
    }
}
