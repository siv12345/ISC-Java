
class p22

{
    void input (String n)
    {
        String s1[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen",
                      "twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        int i,a,b,j;
        a=Integer.parseInt(n.substring(0,2));
        b=Integer.parseInt(n.substring(3,5));
        
        if(a>=25 || b>=60)
        {
            System.exit(0);
        }
          for(i=1;i<13;i++)
          {
          
          if(a==i && b==15)
           {System.out.println("quarter past "+s1[i]); }           
           
           else if(b==45 && a==i)
           { System.out.println("quarter to "+s1[i+1]);}

           else if(b==30 && a==i)
          { System.out.println("half past "+ s1[i]);  }
           else if(b==00 && a==i)
          { System.out.println(s1[i]+" o'clock");     }
          else  if(a==i)
           {
               
                   
               
          if(b<30)
          {
               for(j=1;j<=29;j++)
               {
                   if(b==j)
                   { System.out.println(s1[j]+" minutes past "+s1[i]); }
                }
          }
          else if(b>=31&&b<=59)
          {
               if(a>=1&&a<=11)
               {
               for(j=1;j<=29;j++)
               {   
                   int num=(60-b);
                   if(j==num)
                   { System.out.println(s1[num]+" minutes to "+s1[i]); }
               }
              }
              else if(a==12)
               {
               for(j=1;j<=29;j++)
               {   
                   int num=(60-b);
                   if(j==num)
                   {  System.out.println(s1[num]+" minutes to one");   }
               }
              }
          }
                          
         }
    }

}
}