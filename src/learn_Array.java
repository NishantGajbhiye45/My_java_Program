import java.util.Scanner;

public class learn_Array {
    /*
//    Array creation input/output
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();

        System.out.println("Length of array = " + marks.length);

//        System.out.println("phy: " + marks[0]);
//        System.out.println("chem: " + marks[1]);
//        System.out.println("math: " + marks[2]);
//
//        marks[1] = marks[1] + 5;
//        System.out.println("chem: " + marks[1]);
//
//        int per = (marks[1] + marks[2] + marks[3])/3;
//        System.out.println("Percentage: " + per + "%");
    }
     */


    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95, 96, 91};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        // to print our marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }


}
