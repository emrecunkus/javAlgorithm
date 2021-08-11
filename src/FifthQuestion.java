/*

Implement insertion sort and show an example how it works

Avarage complexity =  "O(n^2)


*/ 

public class FifthQuestion {

	public static int[] InsertionSort(int[] input) {
		int tmp = 0;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					tmp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = tmp;
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 34, 2, 56, 42 };
		int[] result = InsertionSort(arr);
		for (int i : result) {
			System.out.print(i + ", ");
		}
	}
}