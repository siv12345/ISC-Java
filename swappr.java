import java.util.*;
class swappr
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1");
        String s1 = sc.nextLine();
        System.out.println("Enter string s2");
        String s2 = sc.nextLine();
        int l=s1.length();
        s1 += s2;
        s2 = s1.substring(0,l);
        s1 = s1.replace(s2,"");
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
    }
}
        