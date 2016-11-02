/*
 * Code validity checker
 */
class keygencheck
{
    public void main(int n, String s)
    {
        if (n > 6)
        {
            System.out.println("error, length of the string must not exceed 6 characters"); 
            System.exit(0);
        }
        if (s.length() != n)
        {
            System.out.println("error, length of the string not equal to n"); 
            System.exit(0);
        }
        for(int i = 0 ; i < n; i++)
        {   char ch = s.charAt(i); 
            int val = (int)ch;
            if(val >= 65 && val <= 75)
            {    
                System.out.println("Invalid, letters only betweek A and K"); 
                System.exit(0);
            }
            if(Character.isLowerCase(ch))
            {    
                System.out.println("Invalid, Upper case letters only"); 
                System.exit(0);
            }
            if (val % 2 == 0)
            {    
                System.out.println("Invalid, Alternate characters only");
                System.exit(0);
            }
            for (int k = 0 ; k < n ; k++)
                if(s.charAt(i) == s.charAt(k) && k != i)
                {
                    System.out.println("Invalid, No repititions allowed"); 
                    System.exit(0);
                }
        }
        System.out.println("VALID");
    }
}
