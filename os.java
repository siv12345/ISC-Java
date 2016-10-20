import java.util.*;
class os
{
  public static void m()
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    if(n>6)
    {
      System.out.println("Invalid no. of characters");
      return;
    }
    String s = sc.nextLine();
    if(n!=s.length())
    {
      System.out.println("No. of characters not same as that of string");
      return;
    }
    else if(isUpperCase(s)==false)
    { System.out.println("Characters not in uppercase");  return; }
    else
    {
      for(int i=0;i<s.length();i++)
      {
        if(!isthere(s.charAt(i)))
        { System.out.println("String having invalid character"); return; }
        else if(isrepeated(s.charAt(i),s,i))
        {
          System.out.println("Character is repeated"); return;
        }
      }
    }
    System.out.println("Valid!");
  }
  public static boolean isthere(char ch)
  {
    switch(ch)
    {
      case 'A': case 'D': case 'C': case 'E': case 'G': case 'I': case 'K': return true;
    }
  }
  public static boolean isrepeated(char ch,String s,int idx)
  {
    for(int i=0;i<idx;i++)
    {
      if(s.charAt(i)==ch) return true;
    }
    return false;
  }
}
