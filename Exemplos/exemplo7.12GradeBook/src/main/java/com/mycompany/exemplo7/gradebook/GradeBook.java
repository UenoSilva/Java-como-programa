/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo7.gradebook;

/**
 *
 * @author Ueno Souza Silva
 */
public class GradeBook {
    
    private String curseName;
    private int[][] grades;

    public GradeBook(String curseName, int[][] grades) {
        this.curseName = curseName;
        this.grades = grades;
    }

    public String getCurseName() {
        return curseName;
    }

    public void setCurseName(String curseName) {
        this.curseName = curseName;
    }
    
    public void processGrades(){
        outputGrades();
        
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade int the grade book is", getMinimum(),
                "Highest grade int the grade book is", getMaximum());
        
        outputBarChar();
    }
    
    //Retorna a menor nota dos alunos
    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] studentGrade : grades){
            for(int grade : studentGrade){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
    
    //Retorna a maior nota dos alunos
    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int[] studentGrade : grades){
            for(int grade : studentGrade){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }
    
    //Gerar a média de um aluno
    public double getAverage(int[] setOfGrades){
        int total = 0;
        for(int grade : setOfGrades){
            total += grade;
        }
        return (double) total/setOfGrades.length;
    }
    
    //Cria um código de barras das notas dos alunos
    public void outputBarChar(){
        System.out.println("Overall grade distribution:");
        int[] frequency = new int[11];
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                ++frequency[grade/10];
            }
        }
        for(int count = 0; count < frequency.length; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", count*10, count*10 + 9);
            }
            
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    //Gerar a saída das notas dos alunos
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");
        
        //Cabeçario das notas dos alunos
        for(int test = 0; test < grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");
        
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            for(int test : grades[student]){
                System.out.printf("%8d", test);
            }
            
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
