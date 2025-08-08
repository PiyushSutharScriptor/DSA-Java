public class CelebrityProblemBrute {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,0},{0,0,0,0},{0,1,0,0},{1,1,0,0}};

        int n = arr.length;

        int knowsMe[] = new int[n];
        int iKnows[] = new int[n];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j]==1){
                    iKnows[i]+=1;
                    knowsMe[j]+=1;
                }
            }
        }

        System.out.println("Knows me : ");
        for(int e : knowsMe){
            System.out.print(e + " ");
        }

        System.out.println();

        System.out.println("I knows : ");
        for(int e : iKnows){
            System.out.print(e + " ");
        }

        System.out.println();
        
        int a=-1;
        int b=-1;

        for(int i=0 ; i<n ; i++){
            if(knowsMe[i]==n-1 && iKnows[i]==0){
                a=i;
                b=i;
                break;
            }
        }

        //the celebrity will only possible if a and b are same 
        if(a==b && a!=-1 && a!=-1){
            System.out.println("Found element : " + a);
        }
        else{
            System.out.println("Not found : " + -1);
        }
    }
}
