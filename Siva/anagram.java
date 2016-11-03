import java.util.Arrays;
class anagram
{
    public void accept(String s1, String s2)
    {
        char ch1 [] = s1.toCharArray(),  ch2 [] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean flag = true;        
        for(int i = 0; i < s1.length(); i++)
        {
            if (ch1[i] == ch2[i])
                flag = true;
            else 
            {
                flag = false;
                break;
            }
        }        
        System.out.println(flag);       
    }
}
