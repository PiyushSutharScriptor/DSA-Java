public class SetIthBitTo1Brute {
    public static void main(String[] args) {
        int n = 9;
        int i = 2;

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

        s.setCharAt(s.length()-1-i,'1');

        // final answer : 
        System.out.println("Output in binary : " + s);

        //converting the binary to decimal 
        int res = 0;
	    int pow = 1;
        
	    for(int l=s.length()-1 ; l>=0 ; l--){
	        char digit = s.charAt(l);
	   
	        if(digit=='1') res+=pow;
	        
	        pow*=2;
	    }

        System.out.println("Output in decimal : " + res);

    }
}
                      