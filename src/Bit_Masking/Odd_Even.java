package Bit_Masking;

public class Odd_Even {
    public static void main(String[] args) {
        int n=35;
        if((n&1)==1) // bitwise operations are faster than arithmatic operation
            System.out.println("ODD");
        else
            System.out.println("EVEN");
    }
}
