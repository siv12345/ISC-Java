import java.util.*;
class p32
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        String S;char ch;
        int n,i,j,cnt=0,cnt1=0;
        System.out.println("Enter Code=");
        S=sn.nextLine();
        System.out.println("n=");
        n=sn.nextInt();
        if(n>6)
        {
            System.out.println("Invalid length of string");
        }        
        if(S.length()>n)
        {
            System.out.println("Wrong length of the given code");
        }
        for(i=0;i<S.length();i++)
        {
            ch=S.charAt(i);
                if(Character.isLowerCase(ch))
            {
                System.out.println("Code cannot contain Lowercase letters");
            }
            for(j=0;j<S.length();j++)
            { if(S.charAt(j)==ch)
              {
                  cnt++;
              }
            }
             if(cnt>2)
            {
                System.out.println("Code cannot contain repetition");
            }
            cnt=0;          
            for(j=65;j<76;j=j+2)
            {
                if((char)j==ch)
                {cnt1++;}
            }                    
        }        
         if(cnt1>0)
        {
                System.out.println("Invalid");
        }
        else
        {
            System.out.println("Valid Code");
        }
    }
    
}