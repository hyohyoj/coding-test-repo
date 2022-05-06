package _03;

public class MaxMinAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 4, 13, 150, 17, -2 };

		int max = arr[0];
		int min = arr[0];

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}

		for (int i : arr) {
			if (min > i) {
				min = i;
			}
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}

}
