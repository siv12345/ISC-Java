class p31
{
    public static void main(String args[])
    {
       int a, b, c;
        for (a=0;a<5;a++)
        {   for(b=0;b<10-a;b++)
            System.out.print(" ");
            for(c=0;c<2*a+1;c++)
            System.out.print("*");
            System.out.println();
        }
        for(a=0;a<5;a++)
        {   for(b=0;b<8-a;b++)
            System.out.print(" ");
            for(c=0;c<a+2;c++)
            System.out.print("**");
            System.out.println();
        }
        for(a=0;a<5;a++)
        {   for(b=0;b<6-a;b++)
            System.out.print(" ");
            for(c=0;c<a+2;c++)
            System.out.print("**");
            System.out.println();
        }
   }
}
    
