import java.util.*;
class counter
{
    public static void m(String s)
    {
        if(! (s.endsWith(".") || s.endsWith("?")))
        {
            System.out.println("Sentence is not ending with . or ?");
        }
        else
        {
            s = s.substring(0,s.length()-1); //to remove . and ?
            StringTokenizer ob  = new StringTokenizer(s);
            String arr[]  = new String[ob.countTokens()];
    
            for(int i=0;ob.hasMoreTokens();i++)
            {
                String word  = ob.nextToken();
                char c = word.charAt(0);
                word = Character.toUpperCase(c)+word.substring(1);
                arr[i] = word;
                System.out.print(word+" ");
            }
            System.out.println();
            System.out.println("Word\tVowels\tConsonants");
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+"\t"+vow(arr[i])+"\t"+cons(arr[i]));
            }
        }
    }
    public static int vow(String s)
    {
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            switch(ch)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u': c++;
            }
        }
        return c;
    }
    public static int cons(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            switch(ch)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u': break; default: c++;
            }
        }
        return c;
    }
}
        