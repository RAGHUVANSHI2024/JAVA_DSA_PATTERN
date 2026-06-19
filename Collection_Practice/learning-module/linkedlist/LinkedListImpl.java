public class LinkedListImpl {

    Node head = null;
    Node tail = null;

    int getAt(int index){
        Node temp = head;

        for (int i =0; i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    void insertAtIdx(int idx, int data){
        Node t = new Node(data);
        Node temp  = head;

        if (idx == size()){
            insertAtEnd(data);
            return;
        } else if (idx == 0) {
            insertAtHead(data);
            return;
        }
        for (int i =1;i<idx;i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }
    void insertAtHead(int data){
        Node temp = new Node(data);

        if (head == null){
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }
    void insertAtEnd(int data){
        Node temp = new Node(data);

        if (head == null){
            head = temp;
        }
        else {
            tail.next = temp;
        }
        tail = temp;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    int size(){
        Node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
        }
    }

    public static void main(String[] args) {

        LinkedListImpl ll = new LinkedListImpl();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtHead(40);
        ll.display();
        System.out.println(ll.getAt(2));
        ll.insertAtIdx(2,60);
        ll.display();
    }
}
