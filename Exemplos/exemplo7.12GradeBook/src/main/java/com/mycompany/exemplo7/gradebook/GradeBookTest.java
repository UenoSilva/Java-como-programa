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
public class GradeBookTest {
    
    public static void main(String[] args){
        
        int[][] gradeArray = {{87, 96, 70},
                              {68, 87, 90},
                              {94, 100, 90},
                              {100, 81, 82},
                              {83, 65, 85},
                              {78, 87, 65},
                              {85, 75, 83},
                              {91, 94, 100},
                              {76, 72, 84},
                              {87, 93, 73}};
        
        GradeBook myGradeBook = new GradeBook("CS101 Introdution to Java Programming", gradeArray);
        
        System.out.printf("Wellcome to the grade book for%n%s%n%n",
                myGradeBook.getCurseName());
        myGradeBook.processGrades();
    }
    
}
