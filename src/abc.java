import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        try {
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException exception) {
            System.out.println("ahhhh");
        }
    }

}
