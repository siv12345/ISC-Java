import java.util.*;
class MyClass {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter input text");
        StringTokenizer st = new StringTokenizer(sn.nextLine());
        String arr[] = new String[st.countTokens()];
        int k = 0;
        while (st.hasMoreTokens())
            arr[k++] = st.nextToken();   
        String temp = "";         
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {              
                if(arr[j].compareTo(arr[j+1])>0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(String j:arr)
            System.out.println(j);
    }  
}
