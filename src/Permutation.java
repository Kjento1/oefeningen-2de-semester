public class Permutation {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 97;
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}