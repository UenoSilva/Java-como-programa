
package com.mycompany.exemplo11.usingexceptions;

/**
 *
 * @author Ueno Souza Silva
 */
public class UsingExeceptions {

    public static void main(String[] args) {
        
        try{
            method1();
        }catch(Exception exception){
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
            
            StackTraceElement[] traceElements = exception.getStackTrace();
            
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.printf("Class\t\t\t\t\t\t\t\tFile\t\t\tLine\tMethod%n");
            
            for(StackTraceElement element: traceElements){
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
        
    }
    
    public static void method1() throws Exception{
        method2();
    }
    
    public static void method2() throws Exception{
        method3();
    }
    
    public static void method3() throws Exception{
        throw new Exception("Exception throw in method3");
    }
    
}
