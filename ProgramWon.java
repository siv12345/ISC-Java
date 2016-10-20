import java.util.Scanner;
class ProgramWon
{
    public static int[] SortArray(int arr[])
    {
        int temp;
        for(int i = 0; i<arr.length-1;i++)
        {
            for(int j = 0; j<arr.length-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void display(int arr[][])
    {
        int row, col;
        for(row = 0; row<arr.length;row++)
        {
            for(col = 0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    
    public static int displayDiagonalsAndSum(int arr[][])
    {
        int sum = 0;
        int row, col;
        for(row = 0;row<arr.length;row++)
        {
            System.out.println("\t");
            for(col = 0;col<arr[row].length;col++)
            {
                if(row == col || row== arr[row].length-1-col)
                {
                    System.out.print(arr[row][col]);
                    sum += arr[row][col];
                }
                else
                System.out.print(" ");
            }
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int M;
        System.out.println("Enter length/breadth: ");
        M = scan.nextInt();
        int row, col;
        int arr[][] = new int[M][M];
        int non[] =  new int[M*M - (M*2) - 2*(M-2)];
        //entering elements of matrix in arr and storing non boundary in non
        System.out.println("Okay! Enter the elements!");
        int n = 0;
        for(row = 0;row<M;row++)
        {
            for(col = 0; col<M; col++)
            {
                arr[row][col] = scan.nextInt();
                if(row>0&&row<M-1&&col>0&&col<M-1)
                {
                    non[n++] = arr[row][col];
                }
            }
        }
        
        non = SortArray(non);
        //display original matrix
        System.out.println("Original: ");
        display(arr);
        //rearranging non-boundary elements 
        int i,j;
        for(i = 1; i<M-1;i++)
        {
            for(j = 1;j<M-1;j++)
            {
                arr[i][j] = non[i++];
            }
        }
        System.out.println("New matrix: ");
        display(arr);
        System.out.println("Diagonals: ");
        displayDiagonalsAndSum(arr);
    }
}