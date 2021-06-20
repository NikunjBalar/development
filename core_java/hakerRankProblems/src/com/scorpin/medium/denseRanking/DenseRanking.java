package com.scorpin.medium.denseRanking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Purpose : class contain logic for Dense ranking procedure
 * 
 * what is Dense ranking =
 * https://en.wikipedia.org/wiki/Ranking#Dense_ranking_.28.221223.22_ranking.29
 * 
 * ranked=[100,90,90,80]
 * 
 * playerScore=[70,80,105]
 * 
 * The ranked players will have ranks 1, 2, 2, and 3, respectively. If the
 * player's scores are 70, 80 and 105, their rankings after each game are 4, 3
 * and 1. Return [4,3,1].
 * 
 * @author Nikunj Balar
 *
 */
public class DenseRanking {
	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> playerScores) {
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < ranked.size() - 1; i++) {
			if (ranked.get(i).equals(ranked.get(i + 1))) {
				ranked.remove(i);
				i = i - 1;
			}
		}
		System.out.println(ranked);
		System.out.println(ranked.size());
		for (int i = 0; i < playerScores.size(); i++) {
			if (playerScores.get(i) < ranked.get(ranked.size() - 1)) {
				arr.add(ranked.size() + 1);
			} else if (playerScores.get(i) >= ranked.get(0)) {
				arr.add(1);
			}

			else {
				int low = 0;
				int high = ranked.size() + 1;
				int rank = 0;
				while (low <= high) {
					int mid = low + ((high - low) / 2);

					if (playerScores.get(i) == ranked.get(mid)) {
						// arr.add(mid+1);
						rank = mid;
						break;
					} else if (playerScores.get(i) > ranked.get(mid) && playerScores.get(i) < ranked.get(mid - 1)) {
						// arr.add(mid+1);
						rank = mid;
						break;
					} else if (playerScores.get(i) < ranked.get(mid) && playerScores.get(i) >= ranked.get(mid + 1)) {
						// arr.add(mid+1);
						rank = mid + 1;
						break;
					} else if (playerScores.get(i) < ranked.get(mid)) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
				}
				arr.add(rank + 1);
			}
		}
		return arr;
	}

	public static List<Integer> simple(List<Integer> ranked, List<Integer> playerScores) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < ranked.size() - 1; i++) {
			if (ranked.get(i).equals(ranked.get(i + 1))) {
				ranked.remove(i);
				i = i - 1;
			}
		}
		for (int i = 0; i < playerScores.size(); i++) {
			if (playerScores.get(i) < ranked.get(ranked.size() - 1)) {
				arr.add(ranked.size() + 1);
			} else if (playerScores.get(i) >= ranked.get(0)) {
				arr.add(1);
			} else {
				for (int j = ranked.size() - 1; j > 0; j--) {
					if (playerScores.get(i) >= ranked.get(j) && playerScores.get(i) < ranked.get(j - 1)) {
						arr.add(j + 1);
						break;
					} else if (playerScores.get(i) >= ranked.get(j) && playerScores.get(i) >= ranked.get(j - 1)) {
						ranked.remove(j);
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		// List<Integer> result = climbingLeaderboard(ranked, player);
		List<Integer> result = simple(ranked, player);
		System.out.println(result);

		bufferedReader.close();
	}

}
