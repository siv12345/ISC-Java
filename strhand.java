import java.util.*;
class strhand
{
    void main(String input)
    {   input = input + " ";
        Scanner sn = new Scanner(input).useDelimiter(" ");
        int longestword = 0, c = 0, index = 0, palf =0;
        String lw = "";
        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) == ' ')
                c++;
        String str [] = new String [c];
        while(sn.hasNext())
        {
            int freq = 0; 
            Scanner sn1 = new Scanner(input).useDelimiter(" ");
            String s = sn.next();
            str[index] = s;
            if (s.equals(new StringBuffer(s).reverse().toString()))
                System.out.println(s);
            if (s.length() >= longestword)
            {   
                longestword = s.length();
                lw = s; 
            }
            while (sn1.hasNext())
            {   String s1 = sn1.next();
                if (s.equals(s1))
                    freq++;
            }
            if (freq > 1)
                System.out.println("The frequency of " + s + " is " + freq);
            sn1.close();
            index++;
        }
        for (int i = 0; i < c; i ++)
            for (int j = 0; j < c-1; j++)
                if (str[j].compareTo(str[j+1]) > 0)
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }                    
        for (int i = 0; i < c; i++)
            System.out.print(str[i] + " ");
        System.out.println("\nLongest word is " + lw);
    }       
}
