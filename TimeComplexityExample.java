public class TimeComplexityExample{
    public static void main(String args[]){

        for(int i=0 ; i<5 ; i++){
            for(int j=0 ;j<5 ; j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}

//Time complexity = o(n^2)