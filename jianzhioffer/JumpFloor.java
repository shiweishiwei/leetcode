//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）

public class Solution {
    public int JumpFloor(int target) {
        //斐波那契问题
        int a = 1;
        int b = 2;
        int result =1;
        if(target<=2){
            return target;
        }
        else {
            for(int i=3;i<=target;i++){
                result = a+b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}