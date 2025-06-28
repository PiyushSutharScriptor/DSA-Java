
public class NestingDepthParanthesis
{
	public static void main(String[] args) {
	    String s = "(1+(2*3)+((8)/4))+1";
	    int count = 0;
	    int max = 0;
	    
	    for(char ch : s.toCharArray()){
	        if(ch == '('){
	            count++;
	            if(count>max){
	                max = count;
	            }
	        }
	        else if(ch == ')'){
	            count--;
	        }
	    }
	    
	    System.out.println(max);
	}
}