import java.util.Scanner;

public class Product_func {
    public static int multiply(int a, int b){
        int product = a * b;
//        System.out.println(product);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println(prod);
    }
}
