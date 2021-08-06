package algorithmQsinJava;

public class firstquestion {

	public static void main(String[] args) {
		/*
		 * print numbers from 1 to 100 without using a loop
		 * 
		 */
		
		// a way to achieving that is using recursion, as following
		print(1,100);

	}

	private static void print(int  a, int b) {
		if(a!=b+1) {
			System.out.println(a);
			a++;
			print(a,b);
		}
		else {
			System.out.println("all numbers are printed without using a loop");
		}
		
	}

}
