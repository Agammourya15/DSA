//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int num=n;
        int count =0;
        int temp=0;
        
        while(num>0){
            num=num/10;
            count++;
        }
        
        int num1=0;
        num=n;
        int sum = 0 ;
        
        while(num>0){
        num1=num%10;
        num=num/10;
        int s=(int)Math.pow(num1,count);
        sum=sum+s;
    }
    
    return sum==n ? true : false ;
    
}
}