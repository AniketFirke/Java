public class Example_Array_BarChart {

    
    public static void main(String[] args) {

        //array elements : number of students in each grade range (00-09, 10-19...90-99, 100)
        int [] array = { 1, 3, 2, 1, 2, 3, 10, 12, 15, 10, 5 };
    
        System.out.println( "Grade distribution:" );

        // for each array element, output a bar of the chart
        for ( int counter = 0; counter < array.length; counter++ )
        {
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if ( counter == 10 )
                System.out.printf( "%5d: ", 100 );
            else
                System.out.printf( "%02d-%02d: ",counter * 10, counter * 10 + 9 );

            // print bar of asterisks 
            for ( int stars = 0; stars < array[ counter ]; stars++ )
                System.out.print( "*" ); 
            
                      
            System.out.println(); // start a new line of output
        } // end outer for
    } //end of main
}
