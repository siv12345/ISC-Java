import java.util.*;
class bsearch
{
        public void m()
        {
            int arr[] = {1,4,5,7,12,14,21,30,44,47};
            int beg = 0, end = arr.length-1, mid = 0,found = -1, d=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no.");
            d = sc.nextInt();
            while(beg<=end)
            {   mid = (beg+end)/2;
                if(arr[mid] == d)
                {   found = mid; break; }
                if(d > arr[mid])
                {   beg = mid+1;    }
                if(d < arr[mid])
                {   end = mid-1; }
            }
            if(found!=-1)
            {   System.out.println(d+ " found in the array at index "+ found);  }
            else
            {   System.out.println(d+ " not found in the array");
            }
        }
    }
                    
            