/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_gradebook_switchmultiselect;


public class Example_GradeBook_SwitchMultiSelect {

    public static void main(String[] args) {
    
        GradeBook myGradeBook = new GradeBook("OOP with Java");
        
        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();

    }
    
}
