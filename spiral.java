import java.util.*;
class spiral
{
  public static void m()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    int arr[][] = new int[n][n];

    int no = 1;
    char i='r';
    int x =0;
    int y =0;
    int stp = steps(i,arr,0);
    do
    {
      if(no==(n*n)+1) break;
      if(i=='r')
      {
        stp = steps(i,arr,x);
        if(stp!=0)
        {
          arr[x][y] = no;
          no++; y++;
        }
        else
        { i='d'; y--; x++; }
      }
      if(i=='d')
      {
        stp = steps(i,arr,y);
        if(stp!=0)
        {
          arr[x][y] = no;
          no++; x++;
        }
        else
        { i='l'; x--; y--; }
      }
      if(i=='l')
      {
        stp = steps(i,arr,x);
        if(stp!=0)
        {
          arr[x][y] = no;
          no++; y--;
        }
        else
        { i='u'; y++; x--; }
      }
      if(i=='u')
      {
        stp = steps(i,arr,y);
        if(stp!=0)
        {
          arr[x][y] = no;
          no++; x--;
        }
        else
        { i='r'; x++; y++; }
      }

    }while(true);

    for(i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static int steps(char i,int[][] arr, int idx)
  {
    switch(i)
    {
      case 'r':
      case 'l':
          int ans =0;
        for(int j=0;j<arr.length;j++)
        {
          if(arr[idx][j]==0)  ans++;
        }
        return ans;
      case 'u':
      case 'd':
          ans =0;
        for(int j=0;j<arr.length;j++)
        {
          if(arr[j][idx]==0)  ans++;
        }
        return ans;
    }
    return 0;
  }
}
