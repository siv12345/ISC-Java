import java.util.*;
class calendr
{
    public static int[] add(int n, int num, int year)
    {
        int arr[] = new int[2];
        int s = n+num;
        if(s>((year%4==0)?366:365))
        {   
            arr[0] = s-((year%4==0)?366:365); 
            arr[1] = ++year; 
        }
        else
        { 
            arr[0] = s; 
            arr[1] = year; 
        }
        return arr;
    }

    public static int lea(int y)
    {
        if(y%4==0)
            return 29;
        else
            return 28;
    }

    public static String dtow(int n, int y)
    {    
        int te = 0, fe = lea(y);
        if(n<=31)  return n+" Jan, "+y;
        if(n<=(fe+31))  return (n-31)+" Feb, "+y;
        if(n<=(te=31+fe+31))  return (n-te+31)+" Mar, "+y;
        if(n<=(te=31+fe+31+30))  return (n-te+30)+" April, "+y;
        if(n<=(te=31+fe+31+30+31))  return (n-te+31)+" May, "+y;
        if(n<=(te=31+fe+31+30+31+30))  return (n-te+30)+" June, "+y;
        if(n<=(te=31+fe+31+30+31+30+31))  return (n-te+31)+" July, "+y;
        if(n<=(te=31+fe+31+30+31+30+31+31))  return (n-te+31)+" August, "+y;
        if(n<=(te=31+fe+31+30+31+30+31+31+30))  return (n-te+30)+" Sept, "+y;
        if(n<=(te=31+fe+31+30+31+30+31+31+30+31))  return (n-te+31)+" Oct, "+y;
        if(n<=(te=31+fe+31+30+31+30+31+31+30+31+30))  return (n-te+30)+" Nov, "+y;
        if(n<=(te=31+fe+31+30+31+30+31+31+30+31+30+31))  return (n-te+31)+" Dec, "+y;
        return "";
    }

    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day no., year and number of days to add");
        int dayno = sc.nextInt();
        int year = sc.nextInt();
        int n = sc.nextInt();
        if(dayno<1 || dayno>366 || n<1 || n>100)
        {    System.out.println("Wrong inputs"); }
        else
        {
            String s = dtow(dayno,year);
            int arr[] = add(dayno,n,year);
            String s2 = dtow(arr[0],arr[1]);
            System.out.println(s);
            System.out.println("Date after "+n+" days: "+s2);
        }
    }

}