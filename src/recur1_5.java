public class recur1_5 {
    public static void main(String[] args) {
        increase(5);
    }
    public static void increase(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        increase(n - 1);
        System.out.println(n);
    }
}
