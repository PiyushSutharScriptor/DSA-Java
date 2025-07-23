public class CountNoOfSetBitBrute {
    public static void main(String[] args) {
        
        int n = 13;

        // converting decimal to binary : 
        StringBuilder s = new StringBuilder("");
	    
	    while(n!=0){
	        int ans = n%2;
	        char ch = (char)(ans+'0');
	        s.append(ch);
	        n=n/2;
	    }
        s = s.reverse();

        System.out.println(s);

        int count = 0;

        for(int l=0; l<s.length() ; l++){
            if(s.charAt(l)=='1'){
                count++;
            }
        }

        System.out.println(count);
    }
}
