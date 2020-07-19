package com.learning.algorithm.week01.myCircularDeque;

public class MyCircularDeque$V01 {

    class Node{
        Node pre;
        Node next;
        int value;

        public Node(Node pre, Node next, int value) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }
    }

    private int nodeNum;

    private int maxSize;

    private Node firstNode;

    private Node lastNode;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque$V01(int k) {
        if(k < 0){
            throw new IllegalArgumentException("Deque size is less than 0!");
        }
        maxSize = k;
        nodeNum = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(maxSize == nodeNum){
            return false;
        } else {
            if(nodeNum == 0){
                firstNode = lastNode = new Node(null, null, value);
            } else {
                firstNode.pre = new Node(null, firstNode, value);
                firstNode = firstNode.pre;
            }
            nodeNum++;
            return true;
        }
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(maxSize == nodeNum){
            return false;
        } else {
            if(nodeNum == 0){
                firstNode = lastNode = new Node(null, null, value);
            } else {
                lastNode.next = new Node(lastNode, null, value);
                lastNode = lastNode.next;
            }
            nodeNum++;
            return true;
        }
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(nodeNum == 0){
            return false;
        } else {
            if(firstNode == lastNode){
                firstNode = null;
                lastNode = null;
            } else {
                firstNode = firstNode.next;
                firstNode.pre = null;
            }
            nodeNum--;
            return true;
        }
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(nodeNum == 0){
            return false;
        } else {
            if(firstNode == lastNode){
                firstNode = null;
                lastNode = null;
            } else {
                lastNode = lastNode.pre;
                lastNode.next = null;
            }
            nodeNum--;
            return true;
        }
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(nodeNum == 0){
            return -1;
        } else {
            return firstNode.value;
        }
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(nodeNum == 0){
            return -1;
        } else {
            return lastNode.value;
        }
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return nodeNum == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return nodeNum == maxSize;
    }

    public static void main(String[] args) {
        MyCircularDeque$V01 obj = new MyCircularDeque$V01(3);
        boolean param_1 = obj.insertFront(1);
        boolean param_2 = obj.insertLast(2);
        boolean param_3 = obj.deleteFront();
        boolean param_4 = obj.deleteLast();
        int param_5 = obj.getFront();
        int param_6 = obj.getRear();
        boolean param_7 = obj.isEmpty();
        boolean param_8 = obj.isFull();
    }
}

