package Day5.linkedlist;

public class Merge2SortedLinkedLists {

    static class Node {
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;

    public static Node merge2LinkedLists(Node list1,Node list2) {
        Node dummy = new Node(-110);
        Node fin = dummy;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                fin.next = list1;
                list1 = list1.next;
            } else {
                fin.next = list2;
                list2 = list2.next;
            }
            fin = fin.next;
        }

        if(list1 != null) {
            fin.next = list1;
        }
        else if(list2!=null){
            fin.next = list2;
        }

        return dummy.next;
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
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);
        Node merge = merge2LinkedLists(list1,list2);
        display(merge);
    }
}
