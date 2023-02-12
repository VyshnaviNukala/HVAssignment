class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class MergeLinkedLists {
    public static ListNode mergeTwoLists(Node n1, ListNode n2) {
        if (n1 == null) {
            return n2;
        }

        if (n2 == null) {
            return n1;
        }

        if (n1.val < n2.val) {
            n1.next = mergeTwoLists(n1.next, n2);
            return n1;
        } else {
            n2.next = mergeTwoLists(n1, n2.next);
            return n2;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        n1.next = new Node(4);
        n1.next.next = new Node(6);

        Node n2 = new Node(1);
        n2.next = new Node(3);
        n2.next.next = new Node(5);

        Node res = mergeTwoLists(n1, n2);
                System.out.println("Sorted Linked List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            res = res.next;
        }
    }
}