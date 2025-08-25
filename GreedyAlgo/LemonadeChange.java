public class LemonadeChange {
    public static boolean findChange(int arr[]){
        int n = arr.length;

        int a5 = 0;
        int a10 = 0;
        int a20 = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i]==5){
                a5++;
            }
            else if(arr[i]==10){
                if(a5>0){
                    a5--;
                    a10++;
                }
                else return false;
            }
            else{
                if(a5>0){
                    if(a10>0){
                        a10--;
                        a5--;
                    }
                    else if(a5>2){
                        a5-=3;
                    }
                    else{
                        return false;
                    }
                    a20++;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[] = {5,5,5,10,5,5,10,20,20,20};
        System.out.println(findChange(arr));
    }
}

// Optional :  
// else{
//     if(a10>0 && a5>0){
//         a10--;
//         a5--;
//     }
//     else if(a5>2){
//         a5-=3;
//     }
//     else{
//         return false;
//     }
//     a20++;
// }