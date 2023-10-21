0import java.io.*; 
 class PosNegZer 
 { 
             public static void main(String args[] ) 
             throws IOException 
             { 
                    BufferedReader PosNeg = new BufferedReader(new InputStreamReader(System.in)); 
                         String m; 
                         int n,Pos, Neg, Zer,i; 
                         Pos=Neg=Zer=0;  
                         System.out.println("Enter any 5 Number "); 
                         for(i=1;i<=5;i++) 
                         { 
                                     m=PosNeg.readLine(); 
                                     n=Integer.parseInt(m); 
                                     if(n==0)Zer++; 
                                     if(n<0)Neg++; 
                                     if(n>0)Pos++; 
                         } 
                         System.out.println("The Positive Numbers are : "+Pos); 
                         System.out.println("The Negative Numbers are : "+Neg); 
                         System.out.println("The Zero Values are : "+Zer); 
             } 
 }   
