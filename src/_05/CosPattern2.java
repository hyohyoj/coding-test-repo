package _05;

public class CosPattern2 {

	public static void main(String[] args) {

		// 1~30 짝수만 출력
		int number = 1;

		while (number <= 30) {
			if (number % 2 == 1) {
				number++;
				continue; // 홀수면 continue; 아래 코드를 실행하지 않고 다음 반복으로 넘긴다
			}

			System.out.print(number + " ");

			number++;
		}

	}

}
