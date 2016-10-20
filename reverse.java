class reverse
{
    static String rev(String s)
    {
        if(s.length()==1) return s.charAt(0)+"";
        return rev(s.substring(1))+""+s.charAt(0);
    }
    public static void main()
    {
        System.out.println(rev("hello"));
    }
}