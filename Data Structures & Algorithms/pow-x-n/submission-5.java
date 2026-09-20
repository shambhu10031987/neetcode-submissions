class Solution {
    public double myPow(double x, int n) {
        long p=n;
        double result=1;
        if(p<0){
            p=-p;
            x=1/x;
        }
        while(p>0){
           
            if(p%2==1){
                result=result*x;
            }
             x=x*x;
            p=p/2;
        }
        return result;
        
    }
}
