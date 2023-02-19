public class sortArray {
    public static void main(String[] args) {
        int[] a={68,39,34, 46, 78, 46, 78, 23, 13, 64, 42};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+", ");
        }
    }
    
}

