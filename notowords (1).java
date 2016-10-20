import java.util.*;
class notowords
{
    
    public static String tens(int s)
    {
         switch(s)
         {  
             //case 0: return "zero";
             case 1: return "one"; 
             case 2: return "two"; 
             case 3: return "three"; 
             case 4: return "four"; 
             case 5: return "five"; 
             case 6: return "six"; 
             case 7: return "seven";
             case 8: return "eight";
             case 9: return "nine"; 
             case 10: return "ten";
             case 11: return "eleven";
             case 12: return "twelve";
             case 13: return "thirteen";
             case 14: return "fourteen";
             case 15: return "fifteen";
             case 16: return "sixteen";
             case 17: return "seventeen";
             case 18: return "eighteen";
             case 19: return "nineteen";
             case 20: return "twenty";
             case 30: return "thirty";
             case 40: return "fourty";
             case 50: return "fifty";
             case 60: return "sixty";
             case 70: return "seventy";
             case 80: return "eighty";
             case 90: return "ninety";
         }
         return " ";
      }
      public static int extract(int n,int idx)  // idx starts from one from right
      {
          String s = Integer.toString(n);
          int id = s.length()-idx;
          return Integer.parseInt(s.substring(id,id+1));
       }
       public static int len(int n)
       {    return Integer.toString(n).length(); }
       
      public static void main()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a no.");
          int n = sc.nextInt();
          int ar[]={0,0,0,0,0};
           while(n!=0) { 
          ar[0] = n/10000000;
          n = n - ar[0]*10000000;
          ar[1] = n/100000;
          n = n - ar[1]*100000;
          ar[2] = n/1000;
          n = n - ar[2]*1000;
          ar[3] = n/100;
          n = n - ar[3]*100;
          ar[4]  = n;
          //System.out.println(Arrays.toString(ar));
          try {
          {
              if(ar[0]!=0)
              { System.out.print(tens(ar[0])+" crore ");
          }
          {
              int u = ar[1]; if(u!=0) { if(u>=10) {
              if(extract(u,2)!=0) 
              {
                  String w = "";
                  if(u<20) w = tens(u);
                  else w = tens(extract(u,2)*10)+" "+tens(extract(u,1));
                  System.out.print(w+" lac "); 
              } }
              else if(extract(u,1)!=0)
              {
                  String w = "";
                  if(u<20) w = tens(u);
                  System.out.print(w + " lac "); 
              } }
          }
          {
              int u = ar[2]; if(u!=0) { if(u>=10) {
              if(extract(u,2)!=0)
              {
                  String w = "";
                  if(u<20) w = tens(u);
                  else w = tens(extract(u,2)*10)+" "+tens(extract(u,1));
                  System.out.print(w+" thousand "); 
               } }
              else if(extract(u,1)!=0)
              { System.out.print(tens(ar[2]) + " thousand "); } }
          }
          {
              int u = ar[3]; if(u!=0) { 
              if(extract(u,1)!=0) { System.out.print(tens(ar[3])+" hundred "); }  }  
          }
          {
              if(ar[4] != 0)
              { int u = ar[4];
                  String w = "";
                  if(u<20) w = tens(u);
                  else w = tens(extract(u,2)*10)+" "+tens(extract(u,1));
                  
                  System.out.print(w); 
              }
            }
        } 
    } catch(Exception e) {}  
        System.out.println();
       n = sc.nextInt();
    }
          
    } 
  }

             
             