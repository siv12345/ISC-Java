import java.util.*;
class capital
{
     public static void m()
     {
         String s[] = {"Haryana","Madhya Pradesh","Uttar Pradesh","Karnataka","Maharashtra"};
         String c[] = {"Chandigarh","Bhopal","Lucknow","Bangalore","Mumbai"};
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name of state whose capital you want");
         String d = sc.nextLine();
         String msg="";
         for(int i=0;i<s.length;i++)
         {
             if(d.equalsIgnoreCase(s[i]))
             {
                 msg = "Capital of "+d+" is "+c[i];
                 break;
             }
         }
         if(msg!="")
         {  System.out.println(msg);    }
         else
         {  System.out.println("State not found in the array"); }
             
     }
}
                