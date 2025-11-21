public class Adv_Pattern1 {
    public static void half_pyramid(int n){
        //outer loop
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void half_pyramid_with_num(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds(int n){
        int counter = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_tri(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j) % 2 == 0){
                    System.out.print("1" + " ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        for (int i=1; i<=n; i++){
            //stars - i
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            //spaces 2*(n-1)
            for (int j=1; j<=2*(n-1); j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i=n; i>=1; i--){
            //stars - i
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            //spaces 2*(n-1)
            for (int j=1; j<=2*(n-1); j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        half_pyramid(4);
//        half_pyramid_with_num(5);
//        floyds(5);
//        zero_one_tri(5);
        butterfly(4);
    }
}
