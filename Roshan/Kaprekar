public class kaprekar
{
    public void main(int p, int q)
    {
        int d = 0, a = 0, b=0;
        String x = "";
        for(int i = p; i<=q; i++)
        {
            d = Integer.toString(i).length();
            x = Integer.toString(i*i);
            a = Integer.parseInt(x.substring(0,x.length()-d));
            b = Integer.parseInt(x.substring(x.length()-d));
            if(a+b==i)
            System.out.println(i);
        }
    }
}
          
