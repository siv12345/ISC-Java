//Program to calculate the amount that a customer pays for the taxi 
import java.io.*;
class taxi
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Taxi No.");
        String taxino=br.readLine();
        System.out.println("Enter distance travelled");
        int distance=Integer.parseInt(br.readLine());
        int amount;
        if(distance<=10)
        amount=distance*30;
        else if(distance<=30)
        amount=300+((distance-10)*20);
        else if(distance<=70)
        amount=700+((distance-30)*15);
        else
        amount=1300+((distance-70)*12);
        System.out.println("Taxi no."+taxino);
        System.out.println("Amount:"+amount);        
    }
}