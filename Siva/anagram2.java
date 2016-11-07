import java.util.Arrays;
class anagram2
{
    public void accept(String s1, String s2)
    {
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
         char ch1 [] = s1.toCharArray(),  ch2 [] = s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s1.length()-1;j++)
            {
                char ch=ch1[j];
                char c=ch2[j];
                if(ch1[j]>ch1[j+1])
                { ch1[j]=ch1[j+1];
                    ch1[j+1]=ch;}
                 if(ch2[j]>ch2[j+1])
                { ch2[j]=ch2[j+1];
                    ch2[j+1]=c;}    
            }
        }
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
