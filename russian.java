import java.util.*;
class russian
{
  public static void m()
  {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int sum = 0;
    int p = m; q= n;
    while(p!=0)
    {
      if(p%2!=0)
      { sum+=q;}
      p=p/2;
      q=q*2;
    }
    System.out.println(sum);
  }
}
