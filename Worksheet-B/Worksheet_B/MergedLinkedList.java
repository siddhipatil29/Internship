package Worksheet_B;

// Definition of ListNode
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergedLinkedList {
    public static void main(String[] args) {
        ListNode list1 = createLinkedList(new int[] { 1, 3, 5, 7 });
        ListNode list2 = createLinkedList(new int[] { 2, 4, 6, 8, 9 });

        System.out.println("List 1:");
        printLinkedList(list1);
        System.out.println("List 2:");
        printLinkedList(list2);

        ListNode mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged Sorted List:");
        printLinkedList(mergedList);
    }

    public static ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }
}
