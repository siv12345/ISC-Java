import java.util.*;
class circular
{
    static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        int num = 1;
        int r,d,l,u,i,j; i=0; j=-1;  r = n-1; d = n-1; l = 0; u = 1;
        while(num<=25)
        {
            for(int a=++j;a<=r;a++)
            {  arr[i][a] = num; num++; }
            j = r;
            
            for(int a=++i;a<=d;a++)
            {  arr[a][j] = num; num++; }
            i = d;
            r = j-1;
            
            for(int a=--j;a>=l;a--)
            {  arr[i][a] = num; num++; }
            j = l;
            d = i-1;
            
            for(int a=--i;a>=u;a--)
            {   arr[a][j] = num; num++; }
            i = u;
        }
    }
}
                