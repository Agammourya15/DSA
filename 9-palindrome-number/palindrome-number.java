class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int temp=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev){
            return true;
        }
        return false;
  }
}