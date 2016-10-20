import java.util.*;
class lucky
{
  public static void m()
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++)
    { arr[i] = i+1;}
    int step = 2;
    while(true)
    {
      for(int i=0;i<arr.length;i++)
      {
        if((i+1)%step==0)
        {
          arr[i] = 0;
        }
      }
      String s1 = Arrays.toString(arr);
      arr = remngen(arr);
      String s2 = Arrays.toString(arr);
      if(s1.equals(s2)) break;
      step++;
    }

    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static int[] remngen(int arr[])
  {
    String s = "";
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]!=0)
      { s = s+arr[i]+" ";}
    }
    String ar[] = s.split(" ");
    int retarr[] = new int[ar.length];
    for(int i=0;i<retarr.length;i++)
    {
      retarr[i] = Integer.parseInt(ar[i])
    }
    return retarr;
  }
}
