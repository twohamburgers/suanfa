package com.lyc.suanfa.leetcode.tree;


import com.lyc.suanfa.leetcode.utils.TreeNode;
import com.lyc.suanfa.leetcode.utils.util;

import java.util.LinkedList;
import java.util.List;




class Solution {
    List<List<Integer>> b=new LinkedList<List<Integer>>();
    LinkedList<Integer> a=new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        dfs(root,sum);
        return b;

    }
    public void dfs(TreeNode root, int sum)
    {
        if(root==null)
            return ;
        a.add(root.val);
        sum-=root.val;
        if(sum==0&&root.left==null&&root.right==null)
        {b.add(a);}
        dfs(root.left,sum);
        dfs(root.right,sum);
        a.removeLast();
    }

    public static void main(String[] args) {
        String[] ints = {"5", "4", "8", "11", "null", "13", "4", "7", "2", "null", "null", "5", "1"};
        TreeNode treeNode = util.stringToTreeNode(ints);
        new Solution().pathSum(treeNode, 22);
    }



}