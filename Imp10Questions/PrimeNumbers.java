public class PrimeNumbers {
    public static void main(String[] args) {
        int el = 18;

        boolean flag = true;

        for(int i=2 ; i<=el/2 ; i++){
            if(el%i==0){
                flag = false;
                break;
            }
        }
        if(flag){   
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
