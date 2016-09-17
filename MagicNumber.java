public class MagicNumber{
public void main(){
for(int i = 1; i<=100; i++){
int sum = 0;
int j = i;
while(j>0){
int r = j%10;
sum += r;
j = j/10;}
if(sum==1||sum==10)
System.out.println(i+" is a Magic Number");}}}
