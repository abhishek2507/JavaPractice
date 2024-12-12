package Day5.linkedlist;

public class FindMiddleLinkedList {

    static class Node {
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;

    public static Node middleNode(Node head) {
        Node hare = head;
        Node tortoise = head;
        // While there are two nodes ahead of 'hare'
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
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
        ll.next.next.next.next.next = new Node(6);
        Node mid = middleNode(ll);
        System.out.println(mid.data);
    }
}
