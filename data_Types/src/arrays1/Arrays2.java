package arrays1;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        // 1.  fixed size  определение количество
        // 2.  same data type --  один и тот же тип данных

        // 1.
        int[] nums = new  int[2];
        nums[0] = 55;
        nums[0] = 76;
        System.out.println(Arrays.toString(nums));

        // 2.                   0   1  2  3  4
        int nums2 []= new int[]{22,33,45,67,89};
        //                       1  2  3  4  5
         System.out.println(nums2.length);
        System.out.println(Arrays.toString(nums2));// 2,33,45,67,89
        System.out.println(nums2[3]);//67
        System.out.println(nums2.length-1); // 89
        System.out.println(nums2[1+2]); // 67
        String name = "Akmaral";
        System.out.println(name.substring(name.length()-1));

        // Arrays.sort()
        int nums3 []= new int[]{22,33,45,67,89,54,1,478,44,2};
        System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));

        for (int i = 0; i < nums3.length / 2; i++) {
            int temp = nums3 [i];
            nums3 [i] = nums3 [nums3.length - i - 1];
            nums3[nums3.length - i - 1] = temp;
        }



    }


}
