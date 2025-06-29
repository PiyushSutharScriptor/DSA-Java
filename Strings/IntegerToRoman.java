import java.util.*;
public class IntegerToRoman
{
	public static void main(String[] args) {
	    int n = 1998;
	    StringBuilder s = new StringBuilder();
        
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        for(int i=0 ; i<values.length && n>0 ; i++){
            while(n>=values[i]){
                n -= values[i];
                s.append(symbols[i]);
            }
        }
        
        System.out.println(s);
	}
}