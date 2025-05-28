public class FindTheNumberAppearOnceBrute {
    public static void main(String[] args){
        
	   int arr[] = {1,1,2,33,33,44,44,55,55};
	   int n = arr.length;
    
        for(int i=0 ; i<n ; i++){
            int count = 0;
            int num = arr[i];
            
            for(int j=0 ;j<n ; j++){
                if(arr[j]==num){
                    count++;
                }
            }
            
            if(count==1){
                System.out.println("the number is : " + num);
                break;
            }
        }
	   
	   
	}
}