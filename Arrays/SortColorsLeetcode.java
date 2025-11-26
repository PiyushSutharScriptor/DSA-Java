public class SortColorsLeetcode {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int el : arr) {
            if (el == 0)
                zero++;
            else if (el == 1)
                one++;
            else
                two++;
        }

        int i=0;
        while(zero--!=0) arr[i++] = 0;
        while(one--!=0) arr[i++] = 1;
        while(two--!=0) arr[i++] = 2;

        for(int el : arr) System.out.print(el + " ");
    }
}
