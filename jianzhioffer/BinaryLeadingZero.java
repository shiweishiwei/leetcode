//判断整数n的二进制表达中高位的个数
//每次与最高位为1的二进制进行&操作。0x80000000

public class BinaryLeadingZero{
    public int NumberofOne(int n){
        if(n==0) return 32;
        int result = 0;
        int mask = 0x80000000;
        int j = n&mask;
        while(j==0){
            result++;
            n=n<<1;
            j=n&mask;
        }
        return result;
    }
}