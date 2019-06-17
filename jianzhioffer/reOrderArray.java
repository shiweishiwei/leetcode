//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class Solution {
    public void reOrderArray(int [] array) {
        int index = 0;
        int jishunum = 0;
        int newarr[] = new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                jishunum++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                newarr[index++] = array[i];
            }
            else {
                newarr[jishunum++] = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            array[i] = newarr[i];
        }
    }
}