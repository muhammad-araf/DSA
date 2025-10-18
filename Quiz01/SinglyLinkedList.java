package Quiz01;
class LinkedListManager{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    //constructor for Linkedlist manager to initialize the variable head tail size
        public LinkedListManager(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        void addFirst(int data){
        Node newNode = new Node(data, null);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        }
        void addLast(int data){
            Node newNode = new Node(data, null);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        void deleteFirst() {
            if (head == null) return;
            head = head.next;
            size--;
        }
        void deleteLast(){
            if(head == null) return;
            if(head.next == null){
                head = null;
                tail = null;
            } else {
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            size--;
        }
        void display(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
}
        public class SinglyLinkedList {
            public static void main(String args[]){
                LinkedListManager LLM = new LinkedListManager();
                LLM.addFirst(80);
                LLM.addFirst(90);
                LLM.addFirst(110);
                LLM.addLast(210);
                LLM.display();
                LLM.deleteFirst();
                LLM.deleteLast();
                LLM.display();
            }
        }
