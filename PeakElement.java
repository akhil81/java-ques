public class PeakElement {
    
public static void main(String[] args) {
    int[] a={68,39,34, 46, 78, 46, 78, 23, 13, 64, 42};
    int large=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>large)
        {
            large=a[i];
        }
        

    }
    System.out.println("largest no. is "+large);
    
    
}
}
