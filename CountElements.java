public class CountElements
{
    public static void main(String[] args) 
    {
        int b[]={3,7,0,7,0,0,1,0,0,0,2,0,0};
        int c[]=new int[b.length];


        for(int i=0;i<b.length;i++)
        {
            int count=1;
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    count++;
                    c[j]=1;

                }
            }
            if(c[i]!=1)
            {
            System.out.println(b[i]+" come "+count+" times");
            }

        }
    }
}