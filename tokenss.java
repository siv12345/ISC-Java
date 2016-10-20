import java.util.*;
class tokenss
{
    public static void main(String args[])
    {   
        String x = "India is my country";
        StringTokenizer stoken = new StringTokenizer(x);
        
       
        while(stoken.hasMoreTokens())
        {
            String word = stoken.nextToken();
            
            System.out.println(word);
        }
    }
}

            
       