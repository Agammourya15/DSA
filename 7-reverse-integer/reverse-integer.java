class Solution {
    public int reverse(int x) {
        if ( x>Integer.MAX_VALUE-1 || x<Integer.MIN_VALUE ) return 0;
        int sign = 1 ;
        if(x<0) sign = -1 ; 
        int n=Math.abs(x);
        int rev=0;
         while(n>0){
            if(Integer.MAX_VALUE/10 < rev) return 0;
            rev=rev*10+n%10;
            n=n/10;
            
        }
        return rev*sign;
     
    }
}