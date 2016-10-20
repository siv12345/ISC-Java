
import java.util.*;
class denomination
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt = sc.nextInt();
        int d = amt;
        int total = 0;
        amttowords(d);
        
        int arr[][] = {{1000,500,100,50,20,10,5,2,1},new int[9]};
        
        for(int i=0;i<9;i++)
        {
            arr[1][i] = d/arr[0][i];
            d = d%arr[0][i];
            total += arr[1][i];
        }
        
        //printing part
        System.out.println("Note\tNumber\t=\tAmount");
        for(int i=0;i<9;i++)
        {
            System.out.println(arr[0][i]+"\tx"+arr[1][i]+"\t=\t"+(arr[0][i]*arr[1][i]));
        }
        System.out.println("Total number of coins/notes: "+total);
    }
    public static void amttowords(int n)
    {
       String s = "";
       String str = n+"";
       for(int i=0;i<str.length();i++)
       {
           char c = str.charAt(i);
           String ch = "";
           switch(c)
           {    
               case '1' : ch = "one"; break;
               case '2' : ch = "two"; break;
               case '3' : ch = "three"; break;
               case '4' : ch = "four"; break;
               case '5' : ch = "five"; break;
               case '6' : ch = "six"; break;
               case '7' : ch = "seven"; break;
               case '8' : ch = "eight"; break;
               case '9' : ch = "nine"; break;
               case '0' : ch = "zero"; break;
            }
            s = s+" "+ch;
       }
       System.out.println(s);
    }
}