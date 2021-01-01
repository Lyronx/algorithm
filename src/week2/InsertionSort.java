package week2;

import utils.ArrayGenerator;
import utils.SortHelper;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] dataSize={10000,100000};
        for(int n:dataSize){
            Integer[] arr= ArrayGenerator.generateRandomdArray(n,n);
            Integer[] arr2= Arrays.copyOf(arr,arr.length);

            SortHelper.sortTest("InsertionSort",arr);
            SortHelper.sortTest("InsertionSort2",arr2);
        }
    }

    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j-1>=0;j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static <E extends Comparable<E>> void sort2(E[] arr){
        for(int i=0;i<arr.length;i++){
            E tmp=arr[i];
            int j;
            for(j=i;j-1>=0;j--){
                if(tmp.compareTo(arr[j-1])<0){
                    arr[j]=arr[j-1];
                }else{
                    break;
                }
            }
            arr[j]=tmp;
        }
    }

    public static <E> void swap(E[] arr,int i,int j){
        E tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
