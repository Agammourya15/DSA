//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
         int num1=a;
         int num2=b;
         int s= 0;
         if(a>b){
             s=b;
         }else s=a;
         int gcd=0;
        for(int i=1;i<=s;i++){
            if(num1%i==0 && num2%i==0){
                    gcd=i;
                    }
        }
        int Lcm=(num1*num2)/gcd;
        int[] arr=new int[2];
        arr[0]=Lcm;
        arr[1]=gcd;
        return arr;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends