class Solution {
    public double myPow(double x, int n) {
    double result=1;
    long  pow=n;
    if(pow<0){
        x=1/x;
        pow=-pow;
    }
  
      
        if(pow>0){
            while(pow>0){
                if(pow%2==1){
                    result=result*x;
                }
            x=x*x;
            pow=pow/2;
        }}
        return result;

        
    }
}
