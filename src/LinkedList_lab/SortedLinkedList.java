package LinkedList_lab;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @ClassName: SortedLinkedList
 * @Package: LinkedList_lab
 * @Author: Junpeng Li
 * @CreateTime: 10/30/23 11:31 AM
 */
public class SortedLinkedList {

    private final Node head;
    private boolean ascending;

    /**
     * @Description: Constructor
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:43 PM
     * @Param: specify ascending/descending
     */
    public SortedLinkedList(boolean ascending) {
        this.ascending = ascending;
        head = new Node();
    }

    /**
     * @Description: Add c in sorted order
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:43 PM
     * @Param:
     * @Return:
     */
    public void add(Comparable<Integer> c) {
        if (c == null) return;
        if (ascending) {
            insertByAsc(c);
        } else {
            insertByDes(c);
        }
    }

    private void insertByAsc(Comparable<Integer> c) {
        Node cur = head;
        Node next = head.getNext();
        while (next != null) {
            if (c.compareTo((Integer) next.getValue()) >= 0) {
                cur = next;
                next = next.getNext();
            } else {
                break;
            }
        }
        insertNode(cur, c);
    }

    private void insertByDes(Comparable<Integer> c) {
        Node cur = head;
        Node next = head.getNext();
        while (next != null) {
            if (c.compareTo((Integer) next.getValue()) <= 0) {
                cur = next;
                next = next.getNext();
            } else {
                break;
            }
        }
        insertNode(cur, c);
    }

    private void insertNode(Node cur, Comparable<Integer> c) {
        Node n = new Node();
        n.setValue(c);
        n.next = cur.getNext();
        cur.setNext(n);
    }

    @Override
    public String toString() {
        return "SortedLinkedList{" +
                content() +
                '}';
    }

    /**
     * @Description: Return String of the elements that are sorted in this SortedLinkedList.
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:42 PM
     * @Param:
     * @Return:
     */
    private String content() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp.getNext() != null) {
            sb.append(temp.getNext().getValue()).append(", ");
            temp = temp.getNext();
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        return sb.toString();
    }

    /**
     * @Description: Find c, if c exists in ortedLinkedList, then return true, otherwise return false.
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:40 PM
     * @Param: Element
     * @Return: boolean
     */
    public boolean find(Comparable<Integer> c) {
        if (c == null) return false;
        Node temp = head;
        while (temp.getNext() != null) {
            boolean ret = temp.getNext().getValue().equals(c);
            if (ret) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    /**
     * @Description: Removes first occurrence of c
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:40 PM
     */
    public void delete(Comparable<Integer> c) {
        if (c == null) return;
        Node cur = head;
        Node next = cur.getNext();
        while (next != null) {
            boolean ret = next.getValue().equals(c);
            if (ret) {
                cur.setNext(next.getNext());
                next.setNext(null);
            }
            cur = next;
            next = next.getNext();
        }
    }

    /**
     * @Description: Changes the list from ascending to descending
     * @Author: Junpeng Li
     * @CreateTime: 11/5/23 11:39 PM
     */
    public void reverse() {
        ascending = !ascending;
        List<Node> list = new ArrayList<>();
        Node temp = head;
        while (temp.getNext() != null) {
            list.add(temp.getNext());
            temp = temp.next;
        }
        reverseByList(list);
    }

    private void reverseByList(List<Node> list) {
        head.setNext(null);
        int count = list.size() - 1;
        while (count >= 0) {
            Node n = list.get(count);
            add(n.getValue());
            count--;
        }
    }

    public static void main(String[] args) {
        SortedLinkedList linkedList = new SortedLinkedList(false);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.find(4));
        // linkedList.delete(2);
        // System.out.println(linkedList);
        linkedList.reverse();
        System.out.println(linkedList);
    }

    // public boolean find(Comparable<Integer> c) {
    //
    // }

    private class Node {
        private Comparable<Integer> value;
        private Node next;

        public Comparable<Integer> getValue() {
            return value;
        }

        public void setValue(Comparable<Integer> value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
