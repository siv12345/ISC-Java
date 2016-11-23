class Kaprekar
{
    public void main(int p, int q)
    {
        for(int i=p;i<=q;i++)
        {
            String s=Integer.toString(i);
            int l=s.length();  
            String s1=Integer.toString(i*i);
            String s2=s1.substring(s1.length()-l);
            String s3=s1.substring(0,s1.length()-l);
            int n=Integer.parseInt(s2)+Integer.parseInt(s3);
            if(n==i)
            System.out.println(i);
        }
    }
}
