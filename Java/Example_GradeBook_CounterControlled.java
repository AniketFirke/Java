/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_gradebook_countercontrolled;

/**
 *
 * @author LENOVO
 */
public class Example_GradeBook_CounterControlled {

    
    public static void main(String[] args) {
        
        GradeBook myGradeBook = new GradeBook("OOP with Java");
        
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
    
}
