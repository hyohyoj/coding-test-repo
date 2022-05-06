package _05;

import java.util.HashMap;
import java.util.Map.Entry;

public class CosPattern1_HashMap {
	public static void main(String[] args) {

		int[] target = { 1, 3, 3, 2, 1, 1, 3, 0, 1, 2 };

		// target : count
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < target.length; i++) {
			int count = 0;

			for (int j = 0; j < target.length; j++) {
				// 한 번 map에 넣은 값은 다시 count 하지 않음.
				if (!hm.containsKey(target[i])) {
					if (target[i] == target[j]) {
						count++;
					}
				}
			}

			// map에 해당 key가 없다면 값을 저장한다.
			if (!hm.containsKey(target[i])) {
				hm.put(target[i], count);
			}

		}

		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + "번");
		}

	}
}
