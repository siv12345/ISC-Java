import java.util.*;
class decodrx2
{
    public static char shift(char c,int n)
    {
        int num = c+n;
        if(num>90)
        {
            num -= 26;
        }
        return (char) num;
    }
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter encoded string");
        String enc = sc.nextLine();
        System.out.println("Enter shift value");
        int s = sc.nextInt();
        String dec = "";
        enc = enc.replace(" ","");
        if(s>=1 && s<=26)
        {
            s -= 1;
            for(int i=0;i<enc.length();i++)
            {
                char ch = enc.charAt(i);
                if(Character.toLowerCase(ch)!='q')
                {
                    dec += shift(ch,s);
                }
                else
                {
                    if(Character.toLowerCase(enc.charAt(i+1))=='q')
                    {   
                        dec += " ";
                        i+=1;
                    }
                    else
                    {
                        dec += shift(ch,s);
                    }
                }
            }
            System.out.println("Decoded string: "+dec);
        }
        else
        {
            System.out.println("Wrong shift value");
        }
    }
}