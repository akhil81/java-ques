import java.util.*;

public class moveToZero{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // int a[]=sc.nextInt[5];
        int b[]={3,7,0,7,0,0,1,0,0,0,2,0,0};
        int c[]=new int[b.length];
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]!=0)
            {
                c[count]=b[i];
                count++;
            }
        }
        if(count!=b.length)
        {
            for(int j=count;j<b.length;j++)
            {
                c[j]=0;
            }
        }
        for(int k=0;k<c.length;k++)
        {
        System.out.print(c[k]+" ");
        }

        


    }
}