package arrays1;

import java.util.Arrays;

public class DebuggerArray {
    public static void main(String[] args) {
      int num3 [] = new int[] {22,33,45,67,89,54,1,478,44,2};
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);

        for (int i=0; i<num3.length/2;i++){
            int temp = num3[i];
            num3[i]=num3[num3.length-i-1];
            num3[num3.length-i-1]=temp;
        }

    }
}
