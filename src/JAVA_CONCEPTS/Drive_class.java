package JAVA_CONCEPTS;

public class Drive_class{
    public static void fun(int a){//specific to generic
        System.out.println("int");
    }
    public static void fun(long a){
        System.out.println("long");
    }
    public static void fun(Integer a){
        System.out.println("Integer");
    }
    public static void fun(Number a){
        System.out.println("Number");
    }
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
