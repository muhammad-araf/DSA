public class dsa<AnyDataType>{
    Node head;
    Node tail;
    int size;

        public class Node{
            AnyDataType data;
            Node next;
            Node(AnyDataType data,Node next){
                this.data = data;
                this.next = next;
            }
        }

    dsa(){
        head = null;
        tail = null;
        size = 0;
    }
    void addFirst(AnyDataType data){
        Node newNode = new Node(data,null)
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(AnyDataType data){
        Node newNode = new Node(data,null)
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    
}