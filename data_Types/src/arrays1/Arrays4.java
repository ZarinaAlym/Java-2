package src.arrays1;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        Example[] arr = {new Example(), new Example()};
        System.out.println(Arrays.toString(arr));
        //[src.arrays1.Example@2c7b84de, src.arrays1.Example@3fee733d]
        int[] src = {1, 2, 3, 4, 7};
        int[] dest = new int[src.length];
        for (int i = 0; i < dest.length; i++) {
            dest[i] = src[i];
            // i==0;
            //dest[i}==1;

        }
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(src));

        //copyrovanie 2

        int[] dest2=Arrays.copyOf(src,src.length);
        System.out.println(dest2);//[I@2c7b84de
        System.out.println(Arrays.toString(dest2));

        int [] dest4= Arrays.copyOfRange(src,1,4);
        System.out.println(Arrays.toString(dest4));

        int[] nums= new int[5];
        Arrays.fill(nums,8);
        System.out.println(Arrays.toString(nums));

        String[] words= new String[8];
        Arrays.fill(words,"New");
        System.out.println(Arrays.toString(words));

        String[] words2= new String[10];
        Arrays.fill(words2,5,8,"New");
    }

}