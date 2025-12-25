public class StringRecognize{
    public static void main(String[] args) {
        String s = "aaabbc";

        int[] arr = new int[26];
        int n = s.length();

        int maxFreq = -1;
        int maxEle = -1;

        for(int i=0 ; i<n ; i++){
            int idx = s.charAt(i)-'a';
            arr[idx]++;

            if(arr[idx]>maxFreq){
                maxEle = idx;
                maxFreq = arr[idx];
            }
        }

        System.out.println(maxEle);
        System.out.println(maxFreq);

        if(maxFreq>((n+1)/2)){
            System.out.println("_");
        }
        else if(maxFreq<=1){
            System.out.println(s);
        }
        else{
            char[] res = new char[n];

            int id = 0;
            while(arr[maxEle]!=0){
                res[id] = (char)('a'+maxEle);
                id+=2;
                arr[maxEle]--;
            }

            int k=1;
            for(int i=0 ; i<26 ; i++){
                while(arr[i]!=0){
                    res[k] = (char)('a'+i);
                    k+=2;
                    arr[i]--;
                }
            }

            String ans = new String(res);
            System.out.println(ans);

        }

        
    }
}