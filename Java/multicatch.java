public class example_multicatch{
    public static void main(String []args){
         try
         {
            int a=1;
            System.out.println("a="+a);
            int b=42/a;

            int c[]={1};
            c[5]=90;
         }
         catch(ArithmeticException ae)
         {
            System.out.println("divide by zero:"+ae);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println("Array index out of bounds:"+e);
         }
            System.out.println("After try catch box");
    }
}