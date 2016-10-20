class Lezzdothis
{
    public static void main(String args[])
    {
        tes t = new tes();
        tes t1 = new tes();
        tes t2 = new tes();
        t.data=0;
        t1.data=1;
        t2.data=2;
        t=done(t1);
        System.out.println(t.data);
        t1.data=5;
        System.out.println(t.data);
    }
    public static tes done(tes t1)
    {
        return t1;
    }
}
class tes
{
    int data;
}