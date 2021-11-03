package com.example.lib;

//206 反转链表
public class _6_revertList {
            public static ListNode reverseList(ListNode head) {
            if(head.next == null){
                return head;
            }
            ListNode next = null;//保存新链表下一个
            ListNode cur = head;
            ListNode tmp = null;
            while(cur.next != null){
                tmp = cur.next;
                cur.next = next;
                next = cur;
                cur = tmp;
            }

            cur.next = next;
            next = cur;
            return next;
        }
        public static void main(String[] args){
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);
            ListNode node5 = new ListNode(5);

            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = null;
            ListNode result = reverseList(node1);
            while(result !=null){
                System.out.println(result.val);
                result = result.next;
            }

        }
    }
