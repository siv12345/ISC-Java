import java.util.*;
class pirate
{
    public static void main(String args[])
    {
        char c='b';int r=0;int w=0;int v=0;int sum=0;int summ=0;int q=0;
        Scanner sc=new Scanner(System.in);
         Scanner sc1=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the letters");
        String s=sc1.nextLine();
        int a=s.length();
        if(a!=n)
        System.out.println("error-length of sring is not as specified");
        if(a>6)
        System.out.println("the length exceeds 6");
        for(int i=0;i<a;i++)
        {
           if((int)s.charAt(i)%2==0)
           summ++;
           if((int)s.charAt(i)>75&&(int)s.charAt(i)>64)
           {
               v++;
               System.out.println("Out of range letter");
               break;
            }
        for(int j=0;j<a;j++)
        {
            if (s.charAt(i)==s.charAt(j))
            w++;
            c=s.charAt(i);
            boolean f=Character.isLowerCase(c);
            if (f)
            r++;
        }
    }
    if(v==1)
    System.exit(0);
    if (summ>0)
    System.out.println("The letters are not alternate");
        if(r>0)
        System.out.println("Error-lower case not allowed");
        if (w!=a)
        System.out.println("Error-letters have been repeated");
        if(r==0 && r==a && a==n && a<=6)
        System.out.println("valid");
          }
    }
    
        
