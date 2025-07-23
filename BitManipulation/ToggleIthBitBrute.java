public class ToggleIthBitBrute {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;

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

        if(s.charAt(s.length()-1-i)=='0'){
            s.setCharAt(s.length()-1-i,'1');
        }
        else{
            s.setCharAt(s.length()-1-i,'0');
        }

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
