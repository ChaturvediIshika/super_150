package Bit_Masking;

public class Set_bit_find {
    public static void main(String[] args) {
        int n=84;
        int pos=4;
        int mask=1<<pos;
        if((n&mask)>0)
            System.out.println("set");
        else
            System.out.println("NOT");
    }
}
