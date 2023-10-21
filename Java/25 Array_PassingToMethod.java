public class ArrayPassing2Method {
  
    public static void main(String[] args) {
        
        int [] array1 = {1,2,3,4,5};
        
        for(int value : array1)
                System.out.printf ("  %d", value);          1  2  3  4  5
        
        modifyArray(array1);
        System.out.println();
        
        for(int value : array1)
                System.out.printf ("  %d", value);        2  4  6  8  10
        
        System.out.println("\nValue of element at index 3 in main = " + array1[3]);     8
        modifyElement(array1[3] 8);
        System.out.println("Value of element at index 3 in main = " + array1[3]);         8
    }
    
    public static void modifyArray(int [] array)
    {
        for (int counter=0; counter < array.length; counter++)
                array [counter] *= 2;
    }

    public static void modifyElement(int element = 8)
    {
        element *= 2;     
        System.out.println("Value of array element in modifyElement = " + element);     element = 16
    }
}









