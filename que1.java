package questions;

import java.util.Arrays;

public class que1 {

	    public static <T> void printReverse(T[] array) {
	        for (int i = array.length - 1; i > 0; i--) {
	            System.out.print(array[i] + " ");
	        }
	    }
	    public static void main(String[] args) {
	        Integer[] numbers = {1, 2, 3, 4, 5};
	        System.out.println("Original Array: "  + Arrays.toString(numbers));
	        System.out.print("Reversed Array:  ");
	        printReverse(numbers);

	    
	    }
	}
