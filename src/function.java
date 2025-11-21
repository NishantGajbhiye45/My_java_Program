import java.util.Scanner;

public class function {
    public static void hlw() {
        System.out.println("Hello World!🙋‍️");
    }

    public static int calcySum(int a, int b) { //parameters or formal parameters
        int sum = a + b;
        return  sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcySum(a,b);//arguments
        System.out.println(sum);
        hlw(); // function call 🫡


    }
}
