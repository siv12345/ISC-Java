class Set
{
    int arr[];
    int n;
    Set()
    {
        arr = new int[1];
        arr[0] = 0;
        n = 1;
    }
    Set(int a)
    {
        n = a;
    }
    void inputArray()
    {
        arr = new int[n];
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    Set intersection(Set A)
    {
        String s="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<A.n;j++)
            {
                if(arr[i]==A.arr[j])
                {
                    s = s+arr[i]+" ";
                }
            }
        }
        
        String ar2[] = s.split(" ");
        int ar3[] = new int[ar2.length];
        for(int i=0;i<ar2.length;i++)
        {
            ar3[i] = Integer.parseInt(ar2[i]);
        }
        
        Set obj = new Set(ar3.length);
        obj.inputArray();
        obj.arr = ar3;
        return obj;
    }
    
    
    static void main()
    {
        Set A = new Set(4);
        A.inputArray();
        int a[] = {1,2,3,4};
        A.arr = a;
        Set B = new Set(3);
        B.inputArray();
        int b[] = {5,4,1};
        B.arr = b;
        Set C = A.intersection(B);
        C.display();
    }
}
    