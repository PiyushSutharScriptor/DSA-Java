import java.util.*;

public class ReverseSentenceLeetcode
{
	public static void main(String[] args) {
	    String str = "  my name   is   pIyush   ";
	    StringBuilder s = new StringBuilder();
	    
	    String words[] = str.trim().split("\\s+");
	    
	    for(int i=words.length-1 ; i>=0 ; i--){
	        s.append(words[i]);
	        
	        if(i!=0){
	            s.append(" ");
	        }
	    }
	    
	    System.out.println(s);
	}
}