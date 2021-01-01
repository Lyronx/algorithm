package week2;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr={4,1,7,2,9};
        SelectionSort.sort(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();

        Student[] students={new Student("zhangsan",80),
                            new Student("lisi",50),
                            new Student("wangwu",70)};
        SelectionSort.sort(students);
        for(Student e:students){
            System.out.println(e);
        }
    }

    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static <E> void swap(E[] arr,int i,int j){
        E tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
