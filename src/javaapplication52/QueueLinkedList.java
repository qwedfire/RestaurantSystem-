/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication52;

/**
 * @author LAND
 */
public class QueueLinkedList<T> {
    private Node head;
    private Node tail;
    private int count;

    private class Node {
        private Node next;
        private Node previous;
        private T data;

        public Node() {

        }

        public Node(T data) {
            this.data = data;
        }

        public T getdata() {
            return this.data;
        }
    }

    public QueueLinkedList() {
        head = tail = new Node();
        count = 0;
    }

    /**
     * 新增資料
     *
     * @param data
     */
    public void push(T data) {
        Node tmp = tail;
        tail.next = new Node(data);
        tail = tail.next;
        tail.previous = tmp;
        count++;
    }

    /**
     * 拿出並刪除第一筆資料
     *
     * @return
     */
    public T pop() {
        if (tail.previous != null) {
            Node tmp = head;
            Node tmpp = tmp.next;
            head = head.next;
            head.previous = null;
            tmp.next = null;
            count--;
            return tmpp.getdata();
        }
        return null;
    }

    /**
     * 拿出但不刪除第一筆資料
     *
     * @return
     */
    public T peek() {
        Node tmp = head;
        return tmp.next.getdata();
    }

    /**
     * 差入第index筆資料，其他資料向後移
     *
     * @param index
     * @param data
     */
    public void insert(int index, T data) {
        if (index < 0 || index > count) {
            return;
        }
        //如果index等於資料總數則為新增資料，方法跟push一樣
        else if (index == count) {
            Node tmp = tail;
            tail.next = new Node(data);
            tail = tail.next;
            tail.previous = tmp;
            count++;
        }
        //插入第零筆到最後一筆之間
        else {
            Node sceond = head;
            for (int i = 0; i < index; i++) {
                sceond = sceond.next;
            }
            Node first = sceond;  //第一筆沒動
            Node third = sceond.next;  //原本第二筆變成第三筆

            first.next = null;  //跟原本第二筆斷開
            third.previous = null; //原本第二筆和第一筆斷開

            sceond.next = new Node(data);  //給第二筆新資料
            sceond = sceond.next;  //第二筆位置
            sceond.previous = first;  //第二筆指向第一筆
            sceond.next = third;  //第二筆指向第三筆
            third.previous = sceond;  //第三筆前一個指向第二筆
            count++;
        }
    }
    /*
    public void insertt(int index,T data){
        if(index<0||index>count){
            return;
        }
        else if(index==count){
            Node tmp=head;
            for(int i=0;i<index;i++){
                tmp=tmp.next;
            }
            tmp.next=new Node (data);
            count++;
        }
        else{
            Node tmp=head;
            for(int i=0;i<index;i++){
                tmp=tmp.next;
            }
            Node first=tmp;
            Node third=tmp.next;
            first.next=null;
            third.previous=null;
            tmp.next=new Node (data);            
            Node second=tmp.next;
            second.previous=first;
            second.next=third;
            first.next=second;
            third.previous=second;
            count++;            
        }
    }*/

    /**
     * 印出所有資料
     */
    public void print() {
        Node tmp = head;
        while (tmp.next != null) {
            System.out.println(tmp.next.getdata());
            tmp = tmp.next;

        }
    }

    /**
     * 印出順序和所有資料
     */
    public void order() {
        Node tmp = head;
        for (int i = 0; i < size(); i++) {
            tmp = tmp.next;
            System.out.println("第" + (i + 1) + "筆資料 " + tmp.getdata());
        }
    }

    public int size() {
        return count;
    }
}
