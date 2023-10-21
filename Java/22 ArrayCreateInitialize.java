public class Example_Array_CreateInitialize {

    
    public static void main(String[] args) {
    
    //creating an array
    int [] a = new int [10];
    
    System.out.printf("%s%8s\n", "Index", "Value");
    
    for (int counter = 0; counter < 10; counter++)
         System.out.printf("%5d%8d\n", counter, a[counter]);   
    
    // Arary initialization
    int [] a_1 = {10, 20, 25, 30, 35, 40, 45, 50, 75, 95};
    
    System.out.printf("%s%8s\n", "Index", "Value");

       for (int counter = 0; counter < 10; counter++)
           System.out.printf("%5d%8d\n", counter, a_1[counter]);   
    
    //calculating values to be stored in array elements
    
    final int ARRAY_LENGTH = 10;
    
    int [] a_2 = new int[ARRAY_LENGTH];

    for (int counter = 0; counter < 10; counter++)
        a_2 [counter] = 2 + 2 * counter;
    
   
    System.out.printf("%s%8s\n", "Index", "Value");
    
    for (int counter = 0; counter < 10; counter++)
        System.out.printf("%5d%8d\n", counter, a_2[counter]);   
    
    }
}


Index   Value
    0       0
    1       0
    2       0
    3       0
    4       0
    5       0
    6       0
    7       0
    8       0
    9       0
Index   Value
    0      10
    1      20
    2      25
    3      30
    4      35
    5      40
    6      45
    7      50
    8      75
    9      95
Index   Value
    0       2
    1       4
    2       6
    3       8
    4      10
    5      12
    6      14
    7      16
    8      18
    9      20








