public class MultiDimensionalArray {
    public static void main(String[] args) {
        //declaration :
        int [][] a = new int[4][5];

        //set : 
        a[3][4] = 10;
        System.out.println("Element at a[3][4] : " + a[3][4]);

        //Row : 
        System.out.println("No. of rows : " + a.length);

        //Column : 
        System.out.println("No. of column : " + a[0].length);

        // traversal :
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[0].length ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
