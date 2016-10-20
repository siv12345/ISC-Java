import java.util.Scanner;
class Set
{
    int n, arr[];
    Set(int n1)
    {
        n = n1;
        arr = new int[n];
    }

    Set()
    {
        n = 0;
        arr = new int[n];
    }

    void inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data of array in ascending order");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    Set merge(Set b)
    {
        Set temp = new Set(n + b.n);
        int ai = 0, bi = 0;
        while(ai + bi < temp.n)
        {
            if(bi >= b.n || (ai<n && arr[ai] < b.arr[bi]))
                temp.arr[ai+bi] = arr[ai++];
            else
                temp.arr[ai+bi] = b.arr[bi++];
        }
        return temp;
    }

    void display()
    {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String args[])
    {
        Set a=new Set(10), b = new Set(10), c=new Set();
        a.inputArray();
        b.inputArray();
        c=a.merge(b);
        c.display();
    }
}