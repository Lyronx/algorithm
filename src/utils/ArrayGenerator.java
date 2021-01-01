package utils;

import java.util.Random;

public class ArrayGenerator {
    //生成有序数组
    public static Integer[] generateOrderedArray(int size){
        Integer[] res=new Integer[size];
        for(int i=0;i<size;i++){
            res[i]=i;
        }
        return res;
    }
    //生成无序数组
    public static Integer[] generateRandomdArray(int n,int bound){
        Integer[] arr=new Integer[n];
        Random rdm=new Random();
        for(int i=0;i<arr.length;i++)
            arr[i]=rdm.nextInt(bound);
        return arr;
    }
}
