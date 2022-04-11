package _4;

import java.util.Arrays;

public class RankAlgorithm {

	public static void main(String[] args) {

		int[] score = { 88, 50, 38, 100, 90, 100, 99, 65 };
		int[] rank = new int[score.length];

		Arrays.sort(score);

		for (int i = 0; i < score.length; i++) {

			// rank[] 초기화
			rank[i] = 1;

			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}

			System.out.println(score[i] + "점 : " + rank[i] + "등");
		}

	}

}
