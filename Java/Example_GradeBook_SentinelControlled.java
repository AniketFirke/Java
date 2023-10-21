/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_gradebook_sentinelcontrolled;

/**
 *
 * @author LENOVO
 */
public class Example_GradeBook_SentinelControlled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GradeBook myBook = new GradeBook("OOP with Java");
        
        myBook.displayMessage();
        myBook.determineClassAverage();
        
    }
    
}
