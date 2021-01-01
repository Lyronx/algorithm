package week2;

import utils.ArrayGenerator;
import utils.SortHelper;

public class Test {
    public static void main(String[] args) {
        int[] dataSize={10000,100000};
        for(int n:dataSize){
            Integer[] arr= ArrayGenerator.generateRandomdArray(n,n);
            SortHelper.sortTest("SelectionSort",arr);
        }
    }
}
