package Day5.linkedlist;

public class LinkedListScratch {

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node tempNode = head;
            while(tempNode.next!=null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedListScratch list = new LinkedListScratch();
        list.addFirst("yoyo");
        list.addLast("beechme");
        list.addFirst("honey");
        list.printLinkedList();
    }
}
