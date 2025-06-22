import java.util.*;

public class MedainOfTwoSortedArrayBetter {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 7, 10, 12};
        int arr2[] = {2, 3, 6, 15};

        int m = arr1.length;
        int n = arr2.length;

        int total = m + n;
        int arr[] = new int[total];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < m) {
            arr[k++] = arr1[i++];
        }

        while (j < n) {
            arr[k++] = arr2[j++];
        }

        double ans = 0;

        if (total % 2 == 0) {
            ans = (arr[total / 2] + arr[(total / 2) - 1]) / 2.0;
        } else {
            ans = arr[total / 2];
        }

        System.out.println(ans);
    }
}
