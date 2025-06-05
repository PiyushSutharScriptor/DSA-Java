import java.util.*;

public class MajorityElementOptimized
{
	public static void main(String[] args) {
	    int arr[] = {2,2,2};
	    int n = arr.length;
        
        Integer val1 = null, val2 = null;
        int freq1 = 0, freq2 = 0;

        for (int num : arr) {
            if (val1 != null && num == val1) {
                freq1++;
            } else if (val2 != null && num == val2) {
                freq2++;
            } else if (freq1 == 0) {
                val1 = num;
                freq1 = 1;
            } else if (freq2 == 0) {
                val2 = num;
                freq2 = 1;
            } else {
                freq1--;
                freq2--;
            }
        }

        freq1 = 0;
        freq2 = 0;

        for (int num : arr) {
            if (val1 != null && num == val1) freq1++;
            else if (val2 != null && num == val2) freq2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (freq1 > n / 3) ans.add(val1);
        if (freq2 > n / 3) ans.add(val2);

        System.out.println(ans);
	}
}