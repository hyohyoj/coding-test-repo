package CodingTest_Hash_player;

public class Test01 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Solution sol = new Solution();
		System.out.println(sol.solution(participant, completion));
	}

}
