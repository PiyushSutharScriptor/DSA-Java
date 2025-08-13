public class LongestRepeatCharacterReplacement {    
    public static void main(String[] args) {
        String s = "BABABA";  
        int n = s.length();
        int k = 2;
        int count=0;

        for(int i=0 ; i<n ; i++){
            
            int arr[] = new int[26];
            int maxf = 0;
            for(int j=i ; j<n ; j++){
                arr[s.charAt(j)-'A']++;
                maxf = Math.max(maxf,arr[s.charAt(j)-'A']);

                int changes = (j-i+1)-maxf;

                if(changes<=k){
                    count = Math.max(count,j-i+1);
                }
                else break;
            }
        }

        System.out.println(count);
    }   
}
