public class Example_ArrayClass_Manipulations {

    public static void main(String[] args) {
        
        double [] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        
        Arrays.sort(doubleArray);
        
        System.out.printf("\nDouble Array:");
        
        for (double value: doubleArray)
            System.out.printf("%.1f", value);
        
        int [] filledIntArray = new int [10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "FilledArray");
    
        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
    }
    
    public static void displayArray(int [] array, String desc)
    {
        System.out.printf("\n%s:  ",desc);
        for (int value: array)
            System.out.printf("%d ", value);
    }
}
