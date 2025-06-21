public class MinMaxDistanceGasStationBrute
{
	public static void main(String[] args) {
        int arr[] = {1,13,17,23};
        
        int n = arr.length;
        int k = 5;
        
        int karr[] = new int[n-1];
        
        for(int i=0 ; i<k ; i++){
            
            double max = -1;
            int idx = -1;
            
            for(int j=0 ; j<n-1 ; j++){
                int diff = arr[j+1]-arr[j];
                double section = (double)diff/(karr[j]+1);
                
                if(max<section){
                    max = section;
                    idx = j;
                }    
            }
            
            karr[idx]++;
        }
        
        double maxF = -1;
        for(int i=0 ; i<n-1 ; i++){
            int diff = arr[i+1]-arr[i];
            double section = (double)diff/(karr[i]+1);
            maxF = Math.max(maxF,section);
        }
        
        System.out.println(maxF);
	}
}