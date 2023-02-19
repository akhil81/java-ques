public class reverseString{
    public static void main(String[] args) {
        String a="geeksforgeeks";
        String b="";
        System.out.println();
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            b=ch+b;
            System.out.println(b);

        }
        System.out.println("final Answer  "+b);
    }
}