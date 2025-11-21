public class ptrn_Prectice {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for (int i = 1; i<=totRows; i++){
            //inner loop columns
            for (int j = 1; j <= totCols; j++){
                //boundary cell
                if ((i == 4 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 1 && j == 4)){
                    System.out.print("*");
                }else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        hollow_rectangle(4,4);
    }
}
