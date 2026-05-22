import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticFunctions {

  static Scanner sc = new Scanner(System.in);
  public static int B = sc.nextInt();
  public static int H = sc.nextInt();
  public static boolean flag;

  static{
    if(B*H < 0){
      System.out.println("java.lang.Exception: Breadth and height must be positive");
      flag = false;
    }
    else{
      flag = true;
    }
  }  
  


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

