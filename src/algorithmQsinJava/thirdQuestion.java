package algorithmQsinJava;

import java.util.Scanner;

public class thirdQuestion {
    public static void main(String[] args) {
		/*
		 * How to  write a Java Program to swap two numbers by using the third variable.
		 * 
		 */
		
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Before Swapping: " + x+  " " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping:  " + x+ " " + y);

	}

    
}
