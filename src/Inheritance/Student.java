package Inheritance;

public class Student implements Comparable<Student>{
    Student(String s,int a){
        name=s;
        age=a;
    }
    @Override
    public String toString(){
        return "["+name+","+age+"]";
    }
    String name;
    int age;

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
