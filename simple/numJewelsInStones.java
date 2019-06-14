// 你得到的字符串J代表珠宝的石头类型，S代表你拥有的宝石。 S中的每个角色都是你拥有的一种石头。 你想知道你有多少宝石也是珠宝。

// J中的字母保证不同，J和S中的所有字符都是字母。 字母区分大小写，因此“a”被认为是与“A”不同类型的石头。

// 例1：

// 输入：J =“aA”，S =“aAAbbbb”
// 输出：3
// 例2：

// 输入：J =“z”，S =“ZZ”
// 输出：0
// 注意：

// S和J将由字母组成，长度最多为50。
// J中的字符是截然不同的。


//两层循环遍历，想不到更优解
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char J1[] = J.toCharArray();
        char S1[] = S.toCharArray();
        int jl = J1.length;
        int sl = S1.length;
        for(int i=0;i<sl;i++){
            for(int j=0;j<jl;j++){
                if(J1[j]==S1[i]){
                    result++;
                }
            }
        }
        return result;
    }
}