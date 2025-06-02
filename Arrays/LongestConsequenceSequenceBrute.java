import java.util.*;

public class LongestConsequenceSequenceBrute{
	public static void main(String[] args) {
		int arr[] = {1,1,11,1,1,1,1,1,1,1,5,4,100,1,101,3,2,1,1};
		int n = arr.length;

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		int longest = 0;

		for (int num : set) {

			if (!set.contains(num - 1)) {
				int current = num;
				int length = 1;

				while (set.contains(current + 1)) {
					current++;
					length++;
				}

				longest = Math.max(longest, length);
			}
		}

		System.out.print(longest);
	}
}
