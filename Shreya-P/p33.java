class p33
{
void compute(String w,String w1)
{
int l,l1,cnt=0;
l=w.length();
l1=w1.length();
char y[] = w.toCharArray();
char x[] = w1.toCharArray();
char ch;
if(l!=l1)
System.exit(0);
for(int i =0;i<l;i ++)
{
for(int j=0;j<l1;j++)
{
  ch=x[i];

   {
   cnt ++;
  y[j]=' ';
   break;

}
}
}
if(cnt==l)
System.out.println("Anagram");
}
}