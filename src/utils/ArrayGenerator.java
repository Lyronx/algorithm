package utils;

public class ArrayGenerator {
    public static Integer[] generateOrderedArray(int size){
        Integer[] res=new Integer[size];
        for(int i=0;i<size;i++){
            res[i]=i;
        }
        return res;
    }
}
