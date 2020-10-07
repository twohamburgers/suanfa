package com.lyc.suanfa.leetcode.tree;

import com.lyc.suanfa.leetcode.utils.TreeNode;
import com.lyc.suanfa.leetcode.utils.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 廖业成
 * @Description TODO
 * @Date 2020/10/6  9:58
 * @Version 1.0
 **/
class timu94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        dfs(root,a);
        System.out.println(a.toString());
        return a;}

    public void dfs(TreeNode root,List<Integer> a)
    {
        if(root==null)
            return;
        dfs(root.left,a);
        a.add(root.val);
        dfs(root.right,a);
    }


    public static void main(String[] args) {
        String[] a={"1","null","2","3"};
        TreeNode treeNode= util.stringToTreeNode(a);
        new timu94().inorderTraversal(treeNode);
}
     }

