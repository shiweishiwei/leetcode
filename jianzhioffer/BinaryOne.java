//判断整数n的二进制表达中1的个数
//&,与运算，将两个整数二进制按为进行与运算
//n&(n-1)相当于把二进制中最右边的1变为0

public class BinaryOne{
    public int NumberofOne(int n){
        int result = 0;
        while(n!=0){
            n = n&(n-1);
            result++;
        }
        return result;
    }
}