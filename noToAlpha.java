import java.util.*;
public class noToAlpha {
    
    public static void main(String[] ds)
    {
        int n=65;
        char c=(char)n;
        System.out.println(n);

        int[] a={65,90,97,122};
        for(int i=0;i<a.length;i++)
        {
            char ch=(char)a[i];
            System.out.print(ch+"  ");
        }
    }
}
