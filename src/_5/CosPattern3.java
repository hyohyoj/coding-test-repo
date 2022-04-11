package _5;

class CosPattern3 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {

				int output = (i * 10) + j;

				if (j % 2 != 0) {
					continue; // 홀수면 넘김
				} else {
					System.out.print(output + " ");
				}

			}
			System.out.println("");
		}

	}

}
