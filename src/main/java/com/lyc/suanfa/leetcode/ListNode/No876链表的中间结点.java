package com.lyc.suanfa.leetcode.ListNode;

import com.lyc.suanfa.leetcode.utils.ListNode;
import com.lyc.suanfa.leetcode.utils.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 廖业成
 * @Description TODO
 * @Date 2020/10/20  20:13
 * @Version 1.0
 **/
public class No876链表的中间结点 {
        public ListNode middleNode(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = util.stringToListNode(line);

            ListNode ret = new No876链表的中间结点().middleNode(head);

            String out = util.listNodeToString(ret);

            System.out.print(out);
        }}}



