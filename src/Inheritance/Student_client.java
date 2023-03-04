package Inheritance;

import java.util.Comparator;

public class Student_client {
    public static void main(String[] args) {
        Student[] arr=new Student[5];
        System.out.println(arr[0]);
        arr[0]=new Student("pappu",12);
        arr[1]=new Student("ishika",20);
        arr[2]=new Student("anikate",21);
        arr[3]=new Student("Aakrati",20);
        arr[4]=new Student("Kajal",18);
        print(arr);
        bubble(arr,new cc());
        print(arr);
    }
    public static void print(Object[] arr){
        for(Object s:arr)
            System.out.print(s+" ");
        System.out.println();
    }

//    public static<T extends Comparable<T>> void bubble(T[] arr){

    static class  cc implements Comparator<Student>{
        public int compare(Student o1,Student o2){
            return 0;
        }
    }
    public static<T> void bubble(T[] arr,Comparator<T> obj){
        for(int j=1;j< arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (obj.compare(arr[i],arr[i+1])>0)
                {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
//A-B>0      A is greater
//A.compareTo(B)>0      A is greater