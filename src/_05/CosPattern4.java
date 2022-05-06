package _05;

class CosPattern4 {

	public static void main(String[] args) {

		// continue label
		outerloop:
		for (int i = 0; i < 4; i++) {	// B
			for (int j = 0; j < 9; j++) {	// A

				int output = (i * 10) + j;

				if (output % 2 != 0) {
					// j가 1이면 outerloop label이 선언된 바깥쪽 for문으로 분기하여 그 다음 단계부터 다시 수행.
					if(j == 1) {
						continue outerloop;	// B로 이동
					}
					
					continue; // A로 이동
				} else {
					System.out.print(output + " ");
				}

			}
			System.out.println();
		}

	}

}
