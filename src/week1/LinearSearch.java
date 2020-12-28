package week1;

import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        Integer[] data={23,1,5,2,8};
        int res=LinearSearch.search(data,5);
        System.out.println(res);

        Student[] students={new Student("zhangsan"),
                            new Student("lisi"),
                            new Student("wangwu")};
        Student lisi=new Student("lisi");
        res= LinearSearch.search(students,lisi);
        System.out.println(res);
    }

    public static <E> int search(E[] data,E target){
        for(int i=0;i<data.length;i++){
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
