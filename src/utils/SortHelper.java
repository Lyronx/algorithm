package utils;

import week2.InsertionSort;
import week2.SelectionSort;

public class SortHelper {
    //判断一个数组是否是从大到小排序
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for(int i=1;i<arr.length;i++)
            if(arr[i-1].compareTo(arr[i])>0) return false;
        return true;
    }
    //指定排序算法名和数据规模进行性能测试
    public static <E extends Comparable<E>> void sortTest(String sortName,E[] arr){
        long startTime=System.nanoTime();
        if(sortName.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }else if(sortName.equals("InsertionSort")){
            InsertionSort.sort(arr);
        } else if(sortName.equals("InsertionSort2")){
            InsertionSort.sort2(arr);
        }
        long endTime=System.nanoTime();
        String time=(endTime-startTime)/1000000.0+" ms";
        if(!SortHelper.isSorted(arr))
            throw new RuntimeException(sortName+"排序算法出错");
        System.out.println(String.format("%s:n=%d,time=%s",sortName,arr.length,time));

    }
}
