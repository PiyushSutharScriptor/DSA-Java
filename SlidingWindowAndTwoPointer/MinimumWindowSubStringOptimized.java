
public class MinimumWindowSubStringOptimized {
    public static void main(String[] args) {
        String s = "ddaaabbca";
        String k = "abc";

        int n = s.length();
        int m = k.length();

        int arr[] = new int[256];
        for(int i=0 ; i<m ; i++){
            arr[k.charAt(i)]++;
        }

        int count = m; 
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1, end = -1;

        for(int r=0 ; r<n ; r++){
            char ch = s.charAt(r);

            if(arr[ch] > 0) count--; 
            arr[ch]--;

            while(count == 0){
                if(r - l + 1 < minLen){
                    minLen = r - l + 1;
                    start = l;
                    end = r;
                }

                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)] > 0) count++;
                l++;
            }
        }

        if(start == -1){
            System.out.println("No window found"); //empty string
        } else {
            System.out.println(s.substring(start, end+1));
        }
    }
}
