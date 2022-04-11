package _5;

public class CosPattern1_Array {
	public static void main(String[] args) {

		int[] target = { 1, 3, 3, 2, 1, 1, 3, 0, 1, 2 };

		// 0, 1, 2, 3 의 빈도수를 담을 배열
		int[] arr = new int[4];

		for (int i = 0; i < target.length; i++) {
			// target[0] = 1 ==> arr[1]++ : 1의 빈도수 증가
			arr[target[i]]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i] + "번");
		}
	}

}
