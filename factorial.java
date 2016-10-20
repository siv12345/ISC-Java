import java.util.*;
import java.math.*;
class factorial
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = sc.nextLine();
        BigInteger f = new BigInteger("1");
        
        for(BigInteger i=new BigInteger("1");i.compareTo(new BigInteger(s))==-1;i=i.add(new BigInteger("1")))
        {
            f = f.multiply(new BigInteger(i+""));
        }
        
        System.out.println(f.toString()+"\n"+f.toString().length());
    }
}