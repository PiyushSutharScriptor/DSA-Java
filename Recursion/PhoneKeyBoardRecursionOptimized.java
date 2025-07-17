import java.util.*;

public class PhoneKeyBoardRecursionOptimized
{
    public static void generateCombination(int idx, String digits, Map<String,String> map ,List<String> res,StringBuilder output){
        
        //border case
        if(digits==null || digits.length()==0) return;
        
        //base case
        if(idx>=digits.length()){
            res.add(output.toString());
            return;
        }
        
        String num = String.valueOf(digits.charAt(idx));
        String value = map.get(num);

        for(int i=0 ; i<value.length() ; i++){
            output.append(value.charAt(i));
            generateCombination(idx+1,digits,map,res,output);
            output.deleteCharAt(output.length()-1);
        }
        
    }
    
	public static void main(String[] args) {
	    String digits = "23";
	    List<String> res = new ArrayList<>();
	    
	    Map<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        
        StringBuilder output = new StringBuilder();
	    generateCombination(0,digits,map,res,output);
	    
	    System.out.println(res);
	}
}