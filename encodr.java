import java.util.*;
class encodr
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String str = "", enc = "";
        for(int i=0;i<s.length();i++)
        {
            str += ((int) s.charAt(i));
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            enc += str.charAt(i);
        }
        System.out.println(enc);
    }
}