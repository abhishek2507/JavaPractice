package Day5.linkedlist;

public class RemoveNthFromEnd {

    static class Node {
        Integer data;
        Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    public static Node removeNthFromEnd(Node head, int n){
        Node fast = head,slow = head;

        for (int i = 0; i < n; i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
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
        display(removeNthFromEnd(ll,2));
    }
}
