package week2;

public class MyTry {

    public static void main(String[] args) {
        Integer[] arr={4,3,1,5};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static <E extends Comparable<E>> void sort(E[] arr){
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
