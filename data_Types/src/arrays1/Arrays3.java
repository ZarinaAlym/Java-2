package arrays1;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int [] arrs=new int[3];
        arrs[0]=4;
        System.out.println(Arrays.toString(arrs));

                              //  длина
         String [] str = new String[4];
             // индекс
         str[3] = "Zarina";
         str[2] = "Zamira";
        System.out.println(Arrays.toString(str));

        // Многомерные массивы
        int nums[][]= new int[3][2];
        nums[0][0]=22;
        nums[0][1]=23;
        nums[1][0]=25;
        nums[1][1]=26;
        nums[2][0]=27;
        nums[2][1]=28;
        System.out.println(Arrays.deepToString(nums));

        //      0       1         2
        // [22, 23], [25, 26], [0, 0]
//      //   0   1     0   1     0  1
        //
    }
}
