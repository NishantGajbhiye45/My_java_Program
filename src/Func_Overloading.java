public class Func_Overloading {
    /*
    // Using parameters
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
     */


    //Using Data Types
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
//        System.out.println(sum(5,6));
//        System.out.println(sum(3,5,8));

        System.out.println(sum(4,5));
        System.out.println(sum(5.4f,8.5f));
    }
}
