class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
       while(n!=1 &&hs.add(n)) {
        n=helper(n);
            
       }
       return n==1;
    }
    public static int helper(int n){
        int k=0;
        while(n>0){
            k+=(n%10)*(n%10);
            n=n/10;
        }
        return k;
    }
}
