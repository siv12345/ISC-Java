import java.util.*;
class strfn
{
    public static boolean IsVowel(char ch)
    {
        switch(Character.toLowerCase(ch))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
        }
        return false;
    }
    public static String rev(String s)
    {
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            str = str + "" + Character.toString(s.charAt(i));
        }
        return str;
    }
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Enter the string");
        s = sc.nextLine();
        StringTokenizer ob = new StringTokenizer(s);
        String arr1[] = new String[ob.countTokens()];
        String arr2[] = new String[ob.countTokens()];
        int vow = 0;
        String lword = "";  int lsize = 0;
        for(int i=0;ob.hasMoreTokens();i++)
        {
            arr1[i] = ob.nextToken();
            arr2[i] = rev(arr1[i]);
            System.out.print(arr2[i]+" ");
            if(IsVowel((arr1[i]).charAt(0))==true)
            {   vow++; }
        }
        System.out.println();
        System.out.println("Words starting with a vowel in the original string: "+vow);
        lword = arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
            String st = arr1[i];
            if(st.length() > lword.length())
            {
                lword = st;
            }
        }
        lsize = lword.length();
        System.out.println("Longest word: "+lword);
        System.out.println("Size of the longest word: "+lsize);
        System.out.println("Palindromic words: ");
        for(int i=0; i<arr1.length;i++)
        {
            if((arr1[i]).equalsIgnoreCase(arr2[i]))
            { System.out.print(arr1[i]+", "); }
        }
    }
}