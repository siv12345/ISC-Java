import java.util.*;
class word
{
    public static void main(String args[])
    {
        int c=0,sum=0;int g=0;int p=0;int rem=0;int sum1=0;int r=0;int v=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words");
        String s=sc.nextLine();
        String n=sc.nextLine();
        v=s.length();
        r=n.length();
        char ar[]=new char[r];
        if (v!=r)
        {
            System.out.println("Not anagram");
            System.exit(0);
        }
        for (p=0;p<v;p++)
        {
          for(int i=0;i<=sum;i++)
          {
          if(s.charAt(p)==ar[i])
          rem++;
        }
        ar[sum++]=s.charAt(p);
        if (rem==0)
        for (g=0;g<v;g++)
        {
            if (s.charAt(p)==n.charAt(g))
            c++;
        }
        rem=0;
    }
            if (c==v)
            System.out.println("It is anagram");
            else 
            System.out.println("Not anagram");
        }
    }
