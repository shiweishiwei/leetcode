//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

public class Solution {
    public double Power(double base, int exponent) {
        /*double result = (double)1 ;
        if(exponent>0){
            for(int i=1;i<=exponent;i++){
                result*=base;
            }
        }
        else if(exponent<0){
            for(int i=-1;i>=exponent;i--){
                result/=base;
            }
        }
        return result;*/
        if(exponent==0) return 1;
        if(exponent==1) return base;
        boolean zhengshu = true;
        if(exponent<0){
            exponent=-exponent;
            zhengshu=false;
        }
        double result = Power(base*base,exponent/2);
        if(exponent%2!=0){
            result*=base;
        }
        return zhengshu?result:1/result;
  }
}