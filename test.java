import java.util.*;
class test
{
    static String k = "hello";
    static String v ="";
    char c;
    static String permute(String s)
    {
        if(
        if(v==k) return "";
        
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        
        for(int i=0;i<s.length();i++)
        {
            k = s.charAt(i)+s.substring(0,i)+s.substring(i+1,s.length());
            System.out.println(permute(k));
        }
    }
}
            