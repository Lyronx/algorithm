package week1;

public class Student {
    private String name;
    public Student(String name){
        this.name=name;
    }
    //重写Object类型的方法，参数必须为Object类型
    public boolean equals(Object student){
        if(this==student) return true;
        if(student==null) return false;
        if(this.getClass()!=student.getClass()) return false;

        Student another=(Student)student;
        //私有的属性也能直接获取
        return this.name.equals(another.name);
    }
}
