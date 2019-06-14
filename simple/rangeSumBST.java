// 给定二叉搜索树的根节点，返回L和R（包括）之间的值的所有节点的值的总和。

// 二进制搜索树保证具有唯一值。

//  

// 例1：

// 输入：root = [10,5,15,3,7，null，18]，L = 7，R = 15
// 输出：32
// 例2：

// 输入：root = [10,5,15,3,7,13,18,1，null，6]，L = 6，R = 10
// 产量：23
//  

// 注意：

// 树中的节点数最多为10000。
// 最终答案保证不到2 ^ 31。


//前序遍历  根左右
//中序遍历  右根左
//后序遍历  左右根

//中序遍历即生成有序数组

class Solution {
    List<Integer> list = new LinkedList<>();
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)return -1;
        int sum = 0;
        rangeSumBST(root,L,R,list);
        for (int i: list) {
            sum += i;
        }
        return sum;
    }
    private void rangeSumBST(TreeNode root,int L, int R, List<Integer> list){
        if(root==null)return;
        rangeSumBST(root.left,L,R,list);
        if(root.val>=L && root.val<=R){
            list.add(root.val);
        }
        rangeSumBST(root.right,L,R,list);
    }
}