public class Example_ForLoop_SumofEvenNo {

    
    public static void main(String[] args) {
        
           int total = 0;
           
           for(int number = 2; number <= 20; number += 2 )
               total += number; // same as total = total + number
        
           System.out.println("sum of even numbers from 2 to 20 =" + total);
    }
    
}
