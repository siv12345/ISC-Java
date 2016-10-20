import java.util.*;
class ALPHA
{
    public static void m()
    {
        String s = "India is my country";
        StringTokenizer ob = new StringTokenizer(s);
        String arr[] = new String[ob.countTokens()];
        for(int i=0;i<arr.length;i++)
        {
            String word = ob.nextToken();
            char c = word.charAt(0);
            if(c>90) { c-=32; 
            arr[i] = c+word.substring(1); }
            else
            {   arr[i] = word; }
        }
        String t="";
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<(arr.length-i)-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {   System.out.print(arr[i]+" "); }
    }
}