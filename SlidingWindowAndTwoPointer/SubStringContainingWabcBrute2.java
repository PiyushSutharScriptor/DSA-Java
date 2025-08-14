public class SubStringContainingWabcBrute2 {
    public static void main(String[] args) {
        String s = "abcabc";
        int n = s.length();

        int count = 0;
        for(int i=0 ; i<n ; i++){
            int arr[] = new int[3];
            for(int j=i ; j<n ; j++){
                arr[s.charAt(j)-'a']=1;
                if(arr[0]+arr[1]+arr[2]==3) count++;
            }
        }

        System.out.println(count);
    }
}
