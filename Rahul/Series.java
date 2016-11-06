/*This program finds the sum of a series:
 * (1+2)+(1+2+3)+...+10)
 */
class Series
{
    public static void main (String args[])
    {
        int sum=0;
        for(int j=2;j<=10;j++)
        for(int i=0;i<=j;i++)
        sum+=i;
        System.out.println(sum);
    }
}