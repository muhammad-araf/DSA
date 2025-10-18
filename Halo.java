import java.util.*;

import org.w3c.dom.Node;
public class Halo<AnyDataType>{
    private class Node{
        AnyDataType Data;
        Node next;
        Node(AnyDataType data,Node next){
            this.Data = data;
            this.next = next;
        }
    }
    Node head;
    Node tail;
    int size;
    Halo(){
        head = null;
        tail = null;
        size = 0;
    }
    void addFirst(AnyDataType data){
        Node newNode = new Node(data,null);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    void addLast(AnyDataType data){
        Node newNode = new Node(data,null);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
        }
        size++;
    }
    void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.Data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

        void deleteFirst() {
        if (head == null) return;
        head = head.next;
        size--;
        }
        
        void deleteLast() {
        if (head == null) return;
        tail = tail.next;
        size--;
        }

    public static void main(String[] args) {
        Halo<Integer> list = new Halo<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        list.addLast(9);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();

    }
}