import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. ");
        int a=sc.nextInt();
        int count=0;

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
        if(count<=2)
        {
            System.out.println(a+"  is prime no");
        }
        else
        {
            System.out.println(a+"  is not prime");

        }


       
    
}}
