//判断整数n的二进制表达中0的个数
//每次向右移一位，判断最后一位是否为0

public class BinaryZero{
    public int NumberofOne(int n){
        int result = 0;
        while(n!=0){
            n=n>>1;
            if((n&1)!=1){
                result++;
            }
        }
        return result;
    }
}