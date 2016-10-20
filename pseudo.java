import java.util.*;
class pseudo
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the sequence");
        int len = sc.nextInt();
        System.out.println("Enter the elements of the sequence");
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        int s = arr[0]+arr[len-1];
        boolean t = false;
        for(int i=0;i<len;i++)
        {   
            if(s != arr[i]+arr[len-(i+1)])
            {
                t = true;   
                break;
            }
        }
        if(t==true)
            System.out.println("Series is not pseudo arithematic.");
        else
        {
            System.out.println("Series is pseudo arithematic");
            if(len%2==0)System.out.println("Sum of series: "+(s*len/2));
            else System.out.println("Sum of series: "+(s*(len+1)/2));
        }
    }
}                    