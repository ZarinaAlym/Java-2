package arrays1;

import java.util.Arrays;

public class ArrayHomeWork {
    public static void main(String[] args) {
        String [] countries=new String[]{"Kyrgyzstan","Russia","China","Kazakhstan","Uzbekistan"};
        System.out.println(Arrays.toString(countries));



        int [] num1 = new  int[5];
        System.out.println(num1[0]);
        for (int i=0; i < num1.length; i++){
            num1[i]=i*10;
            System.out.println(num1[i]);
        }
        int[] num2={1,2,3};
        for (int i=0; i< num2.length; i++ ){
            System.out.println(num2[i]);
        }
    }
}
