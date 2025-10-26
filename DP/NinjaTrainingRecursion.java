public class NinjaTrainingRecursion {

    public static int meritPoints(int day, int last, int[][] task){
        if(day==0){
            int maxi = 0;
            for(int i=0 ; i<=2 ; i++){
                if(i!=last) maxi = Math.max(maxi,task[0][i]);
            }

            return maxi;
        }

        int maxi = 0;
        for(int i=0 ; i<=2 ; i++){
            int point = 0;
            if(i!=last){
                point = task[day][i]+meritPoints(day-1, i, task);
                maxi = Math.max(maxi,point);
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[][] task = {{10, 40, 70},{20, 50, 80},{30, 60, 90}};
        int n = task.length;

        int res = meritPoints(n-1 , 3, task);
        System.out.println(res);
    }
}
