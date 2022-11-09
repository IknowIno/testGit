package com.qianyier.test01;

public class LinkedList {
    public Node head = new Node(0);

    public void addNode(Node node){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertNodeByIndex(int index,Node node){
        if(index<1||index>length()+1){
            System.out.println("插入位置不合法。");
            return;
        }
        int length = 1;
        Node temp = head;
        while(head.next != null){
            if(index == length++){
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }
    public void delNodeByIndex(int index){
        if(index<1 || index>length()){
            System.out.println("给定的位置不合理");
            return;
        }
        int length=1;
        Node temp = head;
        while(temp.next != null){
            if(index == length++){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void insertSortNode(){
        if(length()<2){
            System.out.println("无需排序");
            return;
        }
        Node newHead = new Node(0);
        Node newTemp = newHead;
        Node temp = head;
        if(newTemp.next == null){
            Node node = new Node(temp.next.data);
            newTemp.next = node;
            temp = temp.next;
        }
        while(temp.next != null){
            while(newTemp.next != null){
                if(newTemp.next.data > temp.next.data){
                    Node node = new Node(temp.next.data);
                    node.next = newTemp.next;
                    newTemp.next = node;
                    break;
                }
                newTemp = newTemp.next;
            }
            if(newTemp.next == null){
                Node node = new Node(temp.next.data);
                newTemp.next = node;
            }
            temp = temp.next;
            newTemp = newHead;
        }
        head = newHead;
    }

    public int length(){
        int length=0;
        Node temp = head;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void print(){
        Node temp = head.next;
        while(temp != null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }
}
