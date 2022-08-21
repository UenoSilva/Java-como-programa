
package com.mycompany.exemplo11.usingexceptions;

/**
 *
 * @author Ueno Souza Silva
 */
public class UsingExceptions {

    public static void main(String[] args) {
        
        try{
            throwException();
        }catch(Exception exception){
            System.err.println("Exception handled in main");
        }
        doesNotException();
    }

    private static void throwException() throws Exception{
        try{
            System.out.println("");
            throw new Exception(); // gera uma exceção 
        }catch(Exception exception){
            System.out.println("Exception handled in method throwException");
            throw exception;
        }finally{
            System.err.println("Finally executed in throwException");
        }
    }

    private static void doesNotException() {
        try{
            System.out.println("Method doesNotThrowException");
        }catch(Exception exception){
            System.err.println(exception);
        }finally{
            System.out.println("End method doesNotThrowException");
        }
    }
    
}
