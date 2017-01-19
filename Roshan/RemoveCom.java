public class common
{
    public void main(String s1, String s2)
    {
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        boolean flag = false;
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<b.length; j++)
            {
                if(a[i]==b[j])
                {
                    flag = true;
                    b[j] = ' ';
                }
            }
            if(flag==true)
            {
                for(int k = 0; k<a.length; k++)
                {
                    if(k!=i)
                    {
                        if(a[k]==a[i])
                        a[k] = ' ';
                    }
                }
                a[i] = ' ';
                flag = false;
            }
        }
        for(int i = 0; i<a.length; i++)
        {
            if(a[i]!=' ')
            System.out.print(a[i]);
        }
        System.out.println();
        for(int i = 0; i<b.length; i++)
        {
            if(b[i]!=' ')
            System.out.print(b[i]);
        }
    }
}
