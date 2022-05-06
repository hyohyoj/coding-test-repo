package _04;

import java.util.Arrays;
import java.util.Collections;

public class SortAlgorithm {

	public static void main(String[] args) {
		Integer[] arr = { 88, 50, 38, 100, 90, 100, 99, 65 };

		// Arrays.sort(arr) // 디폴트 오름차순
		Arrays.sort(arr, Collections.reverseOrder()); // 내림차 순

		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
