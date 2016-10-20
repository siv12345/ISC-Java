class magical
{
    public  static boolean IsMagical(int n)
    {   
        int sum = 0;
        String s = Integer.toString(n);
        if(s.length()==1) { sum = n; }
        while(s.length()>1)
        {  

            for(int i=0;i<s.length();i++)
            {   
                int a =  Integer.parseInt(Character.toString(s.charAt(i)));
                sum = sum + a;
            }
            if(sum<10) 
            {   
                break;
            }
            s  = Integer.toString(sum);
            sum = 0;
        }
        if(sum==1){  return true; }
        return false;
    }

    public static void main()
    {  System.out.println("Magical numbers from 100 to 200 are: ");
        for(int i=100;i<=200;i++)
        {
            if(IsMagical(i)==true)
            {
                System.out.println(i);
            }
            else if(IsMagical(i)==false)
                continue;
        } 

    }
}

                       