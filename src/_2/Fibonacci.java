package _2;

public class Fibonacci {

	public static void main(String[] args) {
		int []number = new int[100];
		number[0] = 1;
		number[1] = 1;
		
		for (int i = 0; i < number.length-2; i++) {
			number[i+2] = number[i] + number[i+1]; 
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(number[i] + " ");
		}

		
	}

}
