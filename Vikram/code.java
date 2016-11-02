import java.util.*;
class code
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sn=new Scanner(System.in); 
        System.out.println("Enter length of code");
        int n=sc.nextInt();
        boolean flag =true;
        if(n>6)
        {   System.out.println("error,length of string should not exceed 6 characters");
            System.exit(0);}
        System.out.println("Enter the code");
        String s=sn.nextLine();
        if(s.length()!=n)
        {   System.out.println("invalid String length not the same as specified");
            System.exit(0);}
        for(int i=0;i<s.length();i++)
        {
            int a= (int)(s.charAt(i));
            if(!Character.isUpperCase(s.charAt(i)))
            {System.out.println("invalid,only uppercase letters permitted");flag=false;  break;}
            else if(a%2==0)
            {System.out.println("invalid,only alternate letters permitted");flag=false;break;}
            else if(a<65||a>75)
            {System.out.println("invalid,only letters from A-K permitted");flag=false;break;}
            else if(s.indexOf(s.charAt(i),i+1)>0)
            {System.out.println("invalid,no repetitions allowed");flag=false;break;}
        }
        if(flag)
        System.out.println("valid");
    }
}
