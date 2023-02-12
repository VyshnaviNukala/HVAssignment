class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class MergeLinkedLists {
    public static Node mergeTwoLists(Node n1, Node n2) {
        Node duli = new tNode(0);
        Node current = duli;

        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                current.next = n1;
                n1 = n1.next;
            } else {
                current.next = l2;
                n2 = n2.next;
            }
            current = current.next;
        }

        if (n1 != null) {
            current.next = n1;
        }

        if (n2 != null) {
            current.next = n2;
        }

        return duli.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(4);
        n1.next = new Node(5);
        n1.next.next = new Node(6);

        Node n2 = new Node(7);
        n2.next = new Node(8);
        n2.next.next = new Node(9);

        Node res = mergeTwoLists(n1, n2);
        System.out.println("Merged Linked List: ");
        while (res != null) {
            System.out.print(result.val + " ");
            res = res.next;
        }
    }
}