import java.util.*;
class mtrx
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length/breadth of matrix");
        int lb = sc.nextInt();
        sc.nextLine();
        /**int arr[][] = new int[lb][lb];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            String s[] = sc.nextLine().split(" ");
            for(int j=0;j<s.length;j++)
            {  
                arr[i][j] = Integer.parseInt(s[j]);
            }
        } */
        int arr[][] = chmtrx.makemtrx(lb);
        System.out.println("Original matrix:");
        printarr(arr);
        
        String nbe = "";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if((i==0 || i==lb-1) ||
                   (i!=0 && (j==0 || j==lb-1)))
                {   continue;   }
                
                nbe = nbe+arr[i][j]+" ";
            }
        }
        String nonb[] = nbe.split(" ");
        int nbel[] = new int[nonb.length];
        for(int i=0;i<nbel.length;i++)
        {   nbel[i] = Integer.parseInt(nonb[i]); }
        sort(nbel);
        
        int arr2[][] = arr.clone();
        int idx = 0;
        String diags[][] = new String[lb][lb];
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if((i==0 || i==lb-1) ||
                   (i!=0 && (j==0 || j==lb-1)))
                {   
                    if((i==0 || i==lb-1) && (j==0 || j==lb-1))
                    diags[i][j] = arr[i][j]+"";
                    else
                    diags[i][j] = " ";
                    continue;   
                }
                
                arr2[i][j] = nbel[idx]; idx++;
                
                if(i==j || i+j==lb-1)
                {   diags[i][j] = arr2[i][j]+"";   }
                else
                {   
                    diags[i][j] = " "; }
            }
        }
        System.out.println();
        printarr(arr2);
        System.out.println();
        printarr(diags);
    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<(arr.length-i)-1;j++)
            {   if(arr[j]>arr[j+1])
                {   int t = arr[j+1]; arr[j+1] = arr[j]; arr[j] = t;    }
            }
        }
    }
    public static void printarr(String[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printarr(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                