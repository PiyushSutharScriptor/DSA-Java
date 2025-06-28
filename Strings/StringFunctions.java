import java.util.*;
public class StringFunctions
{
	public static void main(String[] args) {
	    
	    //Note : String are immutable which means we can't modify
	             //a string once it is stored in memory 
	    //===================================================//
	    //concat : 
	    String firstName = "Piyush";
	    String lastName = "Suthar";
	    String fullName = firstName + " " + lastName;
	    
	    System.out.println(fullName);
	    
	    
	    //===================================================//
	    //length : 
	    String name = "Piyush";
	    System.out.println(name.length());
	    
	    
	    //===================================================//
	    //print character in String 
	    for(char ch : name.toCharArray()){
	        System.out.print(ch + " ");
	    }
	    
	    System.out.println();
	    
	    
	    //===================================================//
	    //print character in String 
	    for(int i=0 ; i<name.length() ; i++){
	        System.out.println(name.charAt(i));
	    }
	    
	    
	    //===================================================//
	    //compare strings
	        /*
	        str1==str2 returns 0;
	        str1>str2 returns +ve;
	        str1<str2 returns -ve;
	        */
	        
	    String str1 = "Ravi";
	    String str2 = "Ravi";
	    if(str1.compareTo(str2) == 0){
	        System.out.println("str1 is equals to str2");
	    }
	    else if(str1.compareTo(str2) < 0){
	        System.out.println("str1 is less than str2");
	    }
	    else{
	        System.out.println("str1 is greater than str2");
	    }
	    
	    
	    //===================================================//
	    //compare strings (inefficient in non primitive)
	     
	        //passed case : 
	        if(str1==str2){
	            System.out.println("Strings are equal");
	        }
	        else{
	            System.out.println("strings are not equal");
	        }
	        
	        //error case : (output is not equal)
	        if(new String("Jack") == new String("Jack")){
	            System.out.println("Strings are equal");
	        }
	        else{
	            System.out.println("strings are not equal");
	        }
	        
	        //solution to error case : 
	        if((new String("Jack")).compareTo(new String("Jack")) == 0){
	            System.out.println("Strings are equal");
	        }
	        else{
	            System.out.println("strings are not equal");
	        }
	        
	    
	    //===================================================//
	    //substring
	    String sentence = "my name is Piyush";
	    System.out.println(sentence.substring(0,10));
	    System.out.println(sentence.substring(5));
	    String sub = sentence.substring(0,15);
	    System.out.println(sub);
	    
	    
	    //===================================================//
	    
	    
	}
}