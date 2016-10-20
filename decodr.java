import java.util.*;
class decodr
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String s = sc.nextLine();
       String str = "", dec = "";
       for(int i=s.length()-1;i>=0;i--)
       {
           str += s.charAt(i);
        }
       int itr = 0;
       while(itr<str.length())
       {
           int t = Integer.parseInt(str.substring(itr,itr+2));
           if( t==32 || (t>=65 && t<=90) || (t>=97 && t<100) )
           {
               itr += 2;
               dec += (char) t;
           }
           else
           {
               t = Integer.parseInt(str.substring(itr,itr+3));
               itr += 3;
               dec += (char) t;
            }
        }
        System.out.println(dec);
    }
}