public class avg_func {
    public static float avg(float a, float b, float c){
        float d = a + b + c;
        float result = d/3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(avg(5f,6f,9f));
    }
}
