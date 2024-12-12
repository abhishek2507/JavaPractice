package Day5.linkedlist;

public class ReverseLinkedList {

    static class Node {
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }

    }

    private ReverseLinkedList.Node head;
    public static Node reverse(Node head){
        Node front = null;
        Node next;
        Node temp = head;
        if(head==null || head.next==null){
            return head;
        }
        while(temp!=null){
            next = temp.next;
            temp.next = front;
            front = temp;
            temp = next;
        }
        return front;
    }
    public static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Node ll = new Node(1);
        ll.next = new Node(2);
        ll.next.next = new Node(3);
        ll.next.next.next = new Node(4);
        ll.next.next.next.next = new Node(5);
        display(reverse(ll));
    }
}
