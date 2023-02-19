import java.util.*;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first no.");
        int a=sc.nextInt();
        System.out.println("enter the second no.");
        int b=sc.nextInt();

        System.out.println("\n( + , - , * , / )");
        System.out.println("which operation u want to use - ");
        char c=sc.next().charAt(0);

        switch(c)
        {
            case'+': System.out.println("answer is "+(a+b));
            break;
            case'-': System.out.println("answer is "+(a-b));
            break;  
            case'*': System.out.println("answer is "+a*b);
            break; 
            case'/': System.out.println("answer is "+a/b);
            break; 
            default: System.out.println("invalid operation!");

        }
             }
    
}
