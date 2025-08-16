public class MinimumWindowSubStringBrute {
    public static void main(String[] args) {
        String s = "ddaaabbca";
        String k = "abc";

        int n = s.length();
        int m = k.length();
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for(int i=0 ; i<n ; i++){
            int arr[] = new int[256];
            int count = 0;

            for(int j=0 ; j<m ;j++){
                arr[k.charAt(j)]++;
            }

            for(int j=i ; j<n ; j++){
                char ch = s.charAt(j);
                if(arr[ch]>0) count++;

                arr[ch]--;

                if(count==m){
                    if((j-i+1) < minLen){
                        minLen = j-i+1;
                        start = i;
                        end = j;
                        break;
                    }   
                }
            }
        }

        System.out.println(s.substring(start, end+1));
    }
}
