/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      int count = 0;
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      /*for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
         ++count;
      }

      int number = LOWERBOUND;        // declare and init loop index variable
      while (number <= UPPERBOUND) {  // test
         sum += number;
         ++number;                    // update
      }

      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum += number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test

      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number*number;     // same as "sum = sum + number"
         ++count;
      }*/

       // Define variables
      int sumOdd  = 0;   // Accumulating sum of odd numbers
      int sumEven = 0;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums
      //......
      // Compute sums
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
         if (number%2 == 1) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      /*if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven;
      } else {
         absDiff = sumEven - sumOdd;
      }*/
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;

      // Compute average in double. Beware that int / int produces int!
      average = (double) sum/ (double) count;
      // Print sum and average
      System.out.println(sumOdd);
      System.out.println(sumEven);
      System.out.println(absDiff);
   }
}