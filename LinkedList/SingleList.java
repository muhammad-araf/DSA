import java.util.*;

public class SingleList<AnyDataType> {
    Node head;
    Node tail;
    int size;

    public SingleList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void addFirst(AnyDataType data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    void addLast(AnyDataType data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public AnyDataType deleteFirst() {
        if (head == null) return null;
        AnyDataType val = head.data;
        head = head.next;
        if (head == null) {tail = null;}
        size--;
        return val;
    }

    private class Node {
        AnyDataType data;
        Node next;

        public Node(AnyDataType data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SingleList<Integer> list = new SingleList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.print("List after addFirst: ");
        list.display();

        System.out.println("deleteByValue(20): " + list.deleteByValue(20));
        System.out.print("List after deleteByValue(20): ");
        list.display();

        System.out.println("deleteFirst(): " + list.deleteFirst());
        System.out.print("List after deleteFirst: ");
        list.display();

        list.addLast(40);
        list.addLast(50);
        System.out.print("List after addLast(40,50): ");
        list.display();

        System.out.println("deleteLast(): " + list.deleteLast());
        System.out.print("List after deleteLast: ");
        list.display();
    }
}
