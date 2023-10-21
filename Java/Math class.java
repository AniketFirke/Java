public class JavaMathExample1    
{    
    public static void main(String[] args)     
    {    
        double x = 25;    
        double y = 5;    
          
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));
        System.out.println("Minimum number of x and y is: " +Math.min(x, y));
        
        System.out.println("Square root of y is: " + Math.sqrt(y));
          //returns 28 power of 4 i.e. 28*28*28*28  
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        
        System.out.println("Logarithm of x is: " + Math.log(x));
        
        System.out.println("Logarithm of y is: " + Math.log(y));
        
        System.out.println("log10 of x is: " + Math.log10(x));
        
        System.out.println("log10 of y is: " + Math.log10(y));
         // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));
        
        System.out.println("exp of a is: " +Math.exp(x)); 
        
        System.out.println("expm1 of a is: " +Math.expm1(x));  
    }    
}    


OUTPUT:-

Maximum number of x and y is: 25.0
Minimum number of x and y is: 5.0
Square root of y is: 2.23606797749979
Power of x and y is: 9765625.0
Logarithm of x is: 3.2188758248682006Logarithm of y is: 1.6094379124341003
log10 of x is: 1.3979400086720377
log10 of y is: 0.6989700043360189
log1p of x is: 3.258096538021482
exp of a is: 7.200489933738588E10
expm1 of a is: 7.200489933638588E10
