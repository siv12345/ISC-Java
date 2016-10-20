//Try using System.currentTimeMillis() instead of System.nanoTime() ... Karan here
class SamDheSort
{
    public static void sort(int data[])
    {
        if(data.length==1)return;
        int a[]=new int[data.length/2];
        int b[]=new int[data.length-a.length];
        for(int i=0;i<data.length;i++)
        {
            if(i<a.length)a[i]=data[i];
            else b[i-a.length]=data[i];
        }
        sort(a);
        sort(b);
        int ai=0,bi=0;
        while(ai+bi<data.length)
        {
            if(bi>=b.length || (ai<a.length && a[ai]<b[bi]))          
                data[ai+bi]=a[ai++];
            else
                data[ai+bi]=b[bi++];
        }
    }
    public static void main(String args[])
    {
        //int arr[]=new int[10000];
        int arr[]=new int[100000]; //using 1 lac array elements ..... around 80 ms in new method and around 11000 ms in bubble sort
        //int arr[]=new int[1000000]; //using 10 lac array elements.....takes around 200 ms in new method and takes very long for bubble sort
        long l1,l2,l3,l4;
        for(int i=0;i<arr.length;i++)
        arr[i]=(int)(Math.random()*100);
        //int arr1[]=arr;
        int arr1[] = arr.clone();
        //long s=System.nanoTime();
        l1 = System.currentTimeMillis();
        sort(arr);
        l2 = System.currentTimeMillis();
        //long e=System.nanoTime();
        System.out.println("Time taken by SamDheSorting: "+(l2-l1)+"ms");
        //s=System.nanoTime();
        l3 = System.currentTimeMillis();
        sort1(arr);
        l4 = System.currentTimeMillis();
        //e=System.nanoTime();
        System.out.println("Time taken by BubbleSorting: "+(l4-l3)+"ms");
    }
    public static void sort1(int data[])
    {
        for(int i=0;i<data.length;i++)
            for(int j=0;j<data.length-1;j++)
                if(data[j]>data[j+1])
                {
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
    }
    
}
