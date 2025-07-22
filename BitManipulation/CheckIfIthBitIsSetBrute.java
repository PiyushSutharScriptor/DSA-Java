
public class CheckIfIthBitIsSetBrute
{
	public static void main(String[] args) {
	    int n = 13;
	    int i= 2;
	    boolean res = false;
	    
	    StringBuilder s = new StringBuilder("");
	    
	    while(n!=0){
	        int ans = n%2;
	        char ch = (char)(ans+'0');
	        s.append(ch);
	        n=n/2;
	    }
	    
	    s = s.reverse();
	    
	    System.out.println(s);
	    
	    int size = s.length()-1;
	    if(s.charAt(size-i) == '1') res = true;
	 
	    System.out.println(res);
	}
}