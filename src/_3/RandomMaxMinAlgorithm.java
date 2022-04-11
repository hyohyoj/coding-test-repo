package _3;

public class RandomMaxMinAlgorithm {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10); // 0~9
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("");

		int max = arr[0];
		int min = arr[0];

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		
		System.out.println("최댓값  : " + max + ", 최솟값 : " + min);

	}

}
