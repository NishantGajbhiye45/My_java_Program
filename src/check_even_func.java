import java.util.Scanner;

public class check_even_func {
    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if (isEven(num)){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
        System.out.println(isEven(num));
    }
}
