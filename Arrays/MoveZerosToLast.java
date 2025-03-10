class MoveZerosToLast {
    public static void main(String[] args) {
        int arr[] = {1,2,0,1,2,0,0,0,2,48,0};
        int n = arr.length;
    
        //logic for size of temp array
        int count = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0){
                count++;
            }
        }
        
        //storing the non zero elements in temp
        int temp[] = new int [count];
        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        System.out.println("Non Zero Elements of temp array : ");
        for(int i=0 ; i<count ; i++){
            System.out.print(temp[i] + " ");
        }
        
        System.out.println();
        j=0;
        for(int i=0 ; i<n ; i++){
            if(i<count){
                arr[i] = temp[j];
                j++;
            }
            else{
                arr[i] = 0;
            }
        }
        
        System.out.println("Final Array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}