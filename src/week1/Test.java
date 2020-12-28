package week1;

import utils.ArrayGenerator;

public class Test {
    public static void main(String[] args) {
        int[] dataSize={1000000,10000000};
        for(int n:dataSize){
            Integer[] data= ArrayGenerator.generateOrderedArray(n);
            long startTime=System.nanoTime();
            //对同一数据规模循环执行，既能不消耗太多内存，也能消除误差
            for(int i=0;i<10;i++){
                LinearSearch.search(data,n);
            }
            long endTime=System.nanoTime();
            System.out.println("数据规模 n ="+n+"，\t执行10次耗时:\t"+(endTime-startTime)/1000000.0+" ms");
        }
    }
}
