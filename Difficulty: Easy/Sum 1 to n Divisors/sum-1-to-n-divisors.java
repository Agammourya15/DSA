//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        int num=n;
        int sum=0;
        for(int i=1;i<=num;i++){
            int currsum=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    currsum+=j;
                    
                }
            }
                sum+=currsum;
        }
        return sum;
    }
}