public class P22 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {

            //when even = 0
            int val = (i % 2 == 0) ? 1 : 0; 
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val;
            }
            System.out.println();
        }
    }
}
