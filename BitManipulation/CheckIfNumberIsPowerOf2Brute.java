public class CheckIfNumberIsPowerOf2Brute {
    public static void main(String[] args) {
        // int n = 16;
        int n = 13;
        
        boolean res = false;

	    StringBuilder s = new StringBuilder("");
	    
	    while(n!=0){
	        int ans = n%2;
	        char ch = (char)(ans+'0');
	        s.append(ch);
	        n=n/2;
	    }

        s = s.reverse();

        int count = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='1') count++;
        }

        if(count==1) res = true;

        System.out.println(res);
    }
}
