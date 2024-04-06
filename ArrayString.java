public class ArrayString {
    public static void main(String[] args) {
        try 
        {
            int[] numbers = {1, 2, 3};
            int index = 5;
            int number = numbers[index];
            System.out.println("Number: " + number);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("");
            System.out.println("Array Index Out Of Bounds Exception || " + e.getMessage());	       	
        }
        try 
        {
            String text = "Hello";
            char character = text.charAt(19);
            System.out.println("Character: " + character);
        } 
        catch (StringIndexOutOfBoundsException e)	        
        {
            System.out.println("");
            System.out.println("String Index Out Of Bounds Exception || " + e.getMessage());
        }
}
}
/*
 * OUTPUT
 Array Index Out Of Bounds Exception || Index 5 out of bounds for length 3

String Index Out Of Bounds Exception || String index out of range: 19
 */
