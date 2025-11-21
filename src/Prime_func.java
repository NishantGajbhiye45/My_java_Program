import java.util.Scanner;

public class Prime_func {
    /*
    // decent aproch
    public static boolean isPrime(int n){
            boolean isPrime = true;

            if (n == 2){
                isPrime = true;
            }
            for (int i = 2; i<=n-1; i++){
                if (n % i == 0){ //completely dividing
                    return false;
                }
            }
            return true;
    }
     */

    //Optimized aproch
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    //Range in Prime numbers
    public static void PrimesinRange(int n){
        for (int i = 2; i<=n; i++){
            if (isPrime(i)){ // "isPrime()" is halper func
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        System.out.println(isPrime());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimesinRange(n);
    }

}
