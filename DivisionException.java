import java.util.Scanner;

public class DivisionException {
     public static void main(String[] args) {
	    	
	    	// creating scanner class to get input from user
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the First number ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the Second number ");
	        int num2 = scanner.nextInt();

	        try  
	        { //Perform division
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } 
	        catch (ArithmeticException e) 
	        { 
	        	
	               	 // Handle exception when number is zero	        	
	            System.out.println("Division by zero is not allowed");
	        }
	    }
}
/*
 * OUTPUT
 Enter the First number 5
Enter the Second number 5
Result: 1
Enter the First number 40
Enter the Second number 0
Division by zero is not allowed
 */