public class PalAlpha
{
    public String pal(String x)
    {
        String y = "";
        for(int i = x.length()-1; i>=0; i--)
        y += x.charAt(i);
        if(x.equals(y))
        return (x+" ");
        else
        return "";
    }     
    public void main(String s)
    {
        int c = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch=='!')
            c++;
        }
        String arr[] = new String[c];
        int d = 0;
        for(int i = 0, j = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch=='!')
            {   
                arr[j]=s.substring(d, i);
                j++;
                d = i+1;
            }
        }
        String pa = "";
        for(int i = 0; i<arr.length; i++)
        pa += pal(arr[i]);
        System.out.println(pa);
        int c2 = 0;
        for(int i = 0; i<pa.length(); i++)
        {
            char ch = pa.charAt(i);
            if(ch==' ')
            c2++;
        }
        System.out.println("No. of palindromic words = "+c2);
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length-1; j++)
            {
                String n = "";
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    n = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = n;
                }
            }
        }
        for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i].startsWith("A")||arr[i].startsWith("E")||arr[i].startsWith("I")||arr[i].startsWith("O")||arr[i].startsWith("U"))
            System.out.print(arr[i]+" ");
        }
    }
}
                    
            