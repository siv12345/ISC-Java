class test
{
    public static void main(String args[])throws Exception
    {
        for(int i=10;i>=0;i--)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
        Thread.sleep(1000);
        System.out.println("TIME UP");
    }
}