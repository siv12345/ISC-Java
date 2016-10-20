import java.util.*;
class ins
{
    int arr[];
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
        arr = new int[n];
        sc.useDelimiter("\\s");
        for(int i=0;i<n;i++)
        {   arr[i] = sc.nextInt();  }
    }
    public static void m()
    {
        ins ob = new ins();
        ob.input();
        ob.sort();
        ob.display();
    }
    void sort()
    {
        for(int i=1;i<arr.length;i++)
        {
            int data = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>data)
            {   arr[j] = arr[j-1]; 
                j--;
            }
            arr[j] = data;
        }
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {   System.out.print(arr[i]+" "); }
    }
}