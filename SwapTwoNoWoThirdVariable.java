public class SwapTwoNoWoThirdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(b);
        System.out.println(a);

    }
    
}
