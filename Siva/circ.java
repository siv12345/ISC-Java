// Write a program to fill in a two dimensional array in a circular fashion with natural numbers from 1 to n^2 given n as an input
// if n = 4, then the array will be 
// 1   2   3   4 
// 12  13  14  5
// 11  16  15  6
// 10  9   8   7
class circ
{
   public void accept(int n)
   {
       int a[][]=new int[n][n],k=0,row=0,col=0;
       for(int i=1;i<=n*n;i++)
       {          
           if(a[row][col]==0)
           a[row][col]=i;
           else if(a[row][col]!=0)
           {              
              if(k%4==0)
              col--;
              if(k%4==1)
              row--;
              if(k%4==2)
              col++;
              if(k%4==3)
              row++;
              k++;
              i--;
            }
           if(row==(n-1)&&k==1||(col==(n-1)&&k==0)||(col==0&&k==2))
           k++;
           if(k%4==0)
           col++;
           if(k%4==1)
           row++;
           if(k%4==2)
           col--;
           if(k%4==3)
           row--;
       }
       for(int m=0;m<n;m++)
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(a[m][l]+"\t");
            }
            System.out.println();
        }
    }
    }
