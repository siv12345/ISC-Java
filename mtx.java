import java.util.*;
class mtx
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n of the matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int arr[][] = new int[m][n];
        int ts[] = new int[m*n];
        int idx = 0;
        int max[] = {Integer.MIN_VALUE,-1,-1}; //no., row, column
        int min[] = {Integer.MAX_VALUE,-1,-1}; 
        System.out.println("Enter the matrix");
        for(int i=0;i<m;i++)
        {
            String ar[] = (sc.nextLine()).split(" ");
            for(int j=0;j<n;j++)
            {
                arr[i][j] = Integer.parseInt(ar[j]);
                ts[idx] = arr[i][j];
                int no = ts[idx]; idx++;
                if(no>max[0])
                {   max[0] = no; max[1] = i; max[2] = j; }
                if(no<min[0])
                {   min[0] = no; min[1] = i; min[2] = j; }
            }
        }
        
        System.out.println("\nOriginal matrix");
        printarr(arr);
        System.out.println("Max value: "+max[0]+" Row: "+max[1]+" Column: "+max[2]);
        System.out.println("Min value: "+min[0]+" Row: "+min[1]+" Column: "+min[2]);
        sort(ts);
        
        int arr2[][] = new int[m][n];
        idx=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j] = ts[idx]; idx++;
            }
        }
        
        System.out.println("Sorted matrix");
        printarr(arr2);
    }
    public static void printarr(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println();
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void sort(int arr[])
    {
        int t = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<(arr.length-i)-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    t = arr[j]; arr[j] = arr[j+1]; arr[j+1] = t;
                }
            }
        }
    }
}
            