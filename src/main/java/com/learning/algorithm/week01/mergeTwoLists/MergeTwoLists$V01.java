package com.learning.algorithm.week01.mergeTwoLists;

import org.springframework.beans.factory.ObjectProvider;

import java.util.List;
import java.util.Objects;

public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(Objects.isNull(l1)) {
            return l2;
        } else if(Objects.isNull(l2)){
            return l1;
        } else {
            ListNode result = new ListNode(-1);
            ListNode temp = result;
            while (Objects.nonNull(l2) && Objects.nonNull(l1)){
                if(l1.val < l2.val){
                    temp.next = l1;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp.next.next = null;
                temp = temp.next;
            }
            temp.next = l1 == null ? l2 : l1;
            return result.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
