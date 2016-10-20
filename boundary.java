import java.util.*;
class boundary
{
  public static void m()
  {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    if(m>2 && m<20 && n>2 && n<20)
    {
      int arr[][] = new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        { arr[i][j] = sc.nextInt();}
      }

      int ar[] = new int[(2*n)+(2*(m-2))];
      int idx = 0;
      for(int i=0;i<m;i++)
      {
        if(i==0 || i==arr.length-1)
        {
          for(int j=0;j<n;j++)
          { ar[idx] = arr[i][j]; idx++;}
        }
        else
        {
          ar[idx] = arr[i][0]; idx++;
          ar[idx] = arr[i][n-1]; idx++;
        }
      }
      sort(ar);

      int rearr[][] = new int[m][n];
      String ob[][] = new String[m][n];
      idx = 0;
      int lidx = ar.length-1;
      for(int i=0;i<m;i++)
      {
        if(i==0)
        {
          for(int j=0;j<n;j++)
          {
            rearr[i][j] = ar[idx]; idx++;
            ob[i][j] = rearr[i][j] + "";
          }
        }
        else if(i>0 && i<m-1)
        {
          rearr[i][0] = ar[lidx]; lidx--;
          rearr[i][n-1] = ar[idx]; idx++;
          for(int j=1;j<n-1;j++)
          {
            rearr[i][j] = arr[i][j];
            ob[i][j] = " ";
          }
        }
        else
        {
          for(int j=0;j<n;j++)
          {
            rearr[i][j] = ar[lidx]; lidx--;
            ob[i][j] = rearr[i][j]+ "";
          }
        }
      }
    }
    printarr(arr);
    System.out.println();
    printarr(rearr);
    System.out.println();
    printarr(ob);
  }

  static void printarr(int arr[][])
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.print(arr[i][j]+ "\t");
      }
      System.out.println();
    }
  }
  static void printarr(String arr[][])
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.print(arr[i][j]+ "\t");
      }
      System.out.println();
    }
  }
}
