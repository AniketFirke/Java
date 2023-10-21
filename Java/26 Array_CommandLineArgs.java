public class Example_Array_CommdArgs {
    
    public static void main(String[] args) {
        
        if (args.length != 3)
            System.out.println("Reenter command with 3 argumants: size of an array, initial value and 											increment");
        else
        {
            int arrayLength = Integer.parseInt(args[0]); 
            int array [] = new int[arrayLength];
            
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            
            for (int counter = 0; counter <array.length; counter++)
                    array[counter] = initialValue + increment * counter;
            
            for (int counter=0; counter <array.length; counter++)
                System.out.printf("%5d%8d\n", counter,array[counter]);       
        }      
    }


>>javac Example_Array_CommdArgs.java

>>java Example_Array_CommdArgs  5  3  3
args[0] = "5"    args [1] = "3"    args[2] = "3"

arrayLength = 5
array[5]
initialValue = 3       increment = 3
array.length = 5
counter = 0 to 4
counter = 0
array[0] = initialValue + increment * counter =  3 + 3*0 = 3
counter 1
array[1] = initialValue + increment * counter =  3 + 3*1 = 6
counter = 2
array[2] = initialValue + increment * counter =  3 + 3*2 = 9
counter = 3
array[3] = initialValue + increment * counter =  3 + 3*3 = 12
counter = 4
array[4] = initialValue + increment * counter =  3 + 3*4 = 15
counter = 5



