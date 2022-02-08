/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 1;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "ONE" );
      } else if ( number == 2 ) {
         System.out.println( "TWO" );
      } else if ( number == 3 ) {
         System.out.println( "THREE" );
      } else if ( number == 4 ) {
         System.out.println( "FOUR" );
      } else if ( number == 5 ) {
         System.out.println( "FIVE" );
      } else if ( number == 6 ) {
         System.out.println( "SIX" );
      } else if ( number == 7 ) {
         System.out.println( "SEVEN" );
      } else if ( number == 8 ) {
         System.out.println( "EIGHT" );
      } else if ( number == 9 ) {
         System.out.println( "NINE" );  
      } else {
         System.out.println("OTHER");
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "TWO" ); break;
         case 3: 
            System.out.println( "THREE" ); break;
         case 4: 
            System.out.println( "FOUR" ); break;
         case 5: 
            System.out.println( "FIVE" ); break;
         case 6: 
            System.out.println( "SIX" ); break;
         case 7: 
            System.out.println( "SEVEN" ); break;
         case 8: 
            System.out.println( "EIGHT" ); break;
         case 9: 
            System.out.println( "NINE" ); break;
         
         default: System.out.println( "OTHER" ); 
      }

      /*      int dayNumber = 0;
 
      if (dayNumber == 0) {  
         System.out.println( "Sunday" );
      } else if ( dayNumber == 1 ) {
         System.out.println( "Monday" );
      } else if ( dayNumber == 2 ) {
         System.out.println( "Tuesday" );
      } else if ( dayNumber == 3 ) {
         System.out.println( "Wednesday" );
      } else if ( dayNumber == 4 ) {
         System.out.println( "Thursday" );
      } else if ( dayNumber == 5 ) {
         System.out.println( "Friday" );
      } else if ( dayNumber == 6 ) {
         System.out.println( "Saturday" );
      } else {
         System.out.println("Not a valid day");
      }
 
      switch(dayNumber) {
         case 0: 
            System.out.println( "Sunday" ); break;  
         case 1: 
            System.out.println( "Monday" ); break;
         case 2: 
            System.out.println( "Thursday" ); break;
         case 3: 
            System.out.println( "Wednesday" ); break;
         case 4: 
            System.out.println( "Thursday" ); break;
         case 5: 
            System.out.println( "Friday" ); break;
         case 6: 
            System.out.println( "Saturday" ); break;
         
         default: System.out.println( "Not a valid day." ); 
      }
   }
*/
   }
}