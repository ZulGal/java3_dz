public class dz3 {
    private static class Node {
        Node next;
        int value;
    }

    static Node head;

    public static void revert() {
        if (head != null) {
            Node oldhead = head;
            Node current = head;
            while (current.next != null) current = current.next;
            head = current;
            Node lastcurrent = current;
            while (lastcurrent != oldhead) {
                current = oldhead;
                while (current.next != lastcurrent) current = current.next;
                lastcurrent.next = current;
                lastcurrent = current;
            }
        }
    }

}

