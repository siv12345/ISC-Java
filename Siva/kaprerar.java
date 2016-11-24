class kaprekar
{
    public void main(int p , int q)
    {
        for (int i = p ; i <= q; i++)
        {
            String RHP = Integer.toString(i*i).substring((Integer.toString(i*i).length() - Integer.toString(i).length()));
            String LHP = Integer.toString(i*i).substring(0,(Integer.toString(i*i).length() - Integer.toString(i).length()));
            if ((Integer.parseInt(RHP) + Integer.parseInt(LHP)) == Integer.parseInt(Integer.toString(i)))
                System.out.println(i);
        }
    }
}
