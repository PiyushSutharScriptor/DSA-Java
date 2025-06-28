import java.util.*;
public class StringBuilderFunctions
{
	public static void main(String[] args) {
	    
	    //string builder (creation)
	    StringBuilder s = new StringBuilder("Piyush");
	    System.out.println(s);
	    
	    //length 
	    System.out.println(s.length());
	    
	    //char at index
	    System.out.println(s.charAt(0));
	    
	    //set char at index
	    s.setCharAt(0,'A');
	    System.out.println(s);
	    
	    //insert char at index
	    s.insert(0,'P');
	    System.out.println(s);
	    
	    //delete part of String
	    s.delete(0,1);
	    System.out.println(s);
	    
	    //append char (last)
	    s.append('S');
	    System.out.println(s);
	    
	}
}