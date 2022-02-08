/*
 * Print the area and circumference of a circle, given its radius.
 */
public class RectangleComputation {  // Save as "RectangleComputation.java"
   public static void main(String[] args) {
      // Declare 3 double variables to hold length, width, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double length, width, area, perimeter;
      
      // Assign a value to length, width. (We shall read in the value from the keyboard later.)
      length = 2;
      width = 5;
      // Compute area and perimeter
      area = length * width ;
      perimeter = 2*(length+width);
      
      // Print results
      System.out.print("The length is ");  // Print description
      System.out.println(length);
      System.out.print("The width is ");
      System.out.println(width);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}