
// BreakTest.java 
// break statement exiting a for statement. 

public class BreakTest 
 { 
     public static void main( String args[] ) 
     { 
             int count; 
 
             for ( count = 1; count <= 10; count++ ) // loop 10 times 
             { 
              	if ( count == 5 ) // if count is 5, 
              		break; // terminate loop 
 
             	System.out.printf( "%d ", count ); 

         	} // end for 
 
         System.out.printf( "\nBroke out of loop at count = %d\n", count ); 

     } // end main 
 } // end class BreakTest 


count = 1  2  3  4  5

O/p
1   2  3  4
Broke out of loop at count = 5









