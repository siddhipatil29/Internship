package Worksheet_B;

import java.util.HashSet;

// Definition of a ListNode
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class UnionIntersectionLinkedList {
    public static void main(String[] args) {
        ListNode list1 = createLinkedList(new int[] {1, 2, 3, 4, 5});
        ListNode list2 = createLinkedList(new int[] {3, 4, 5, 6, 7});
        
        System.out.println("List 1: ");
        printLinkedList(list1);
        System.out.println("List 2: ");
        printLinkedList(list2);
        
        ListNode union = findUnion(list1, list2);
        ListNode intersection = findIntersection(list1, list2);
        
        System.out.println("Union of the lists: ");
        printLinkedList(union);
        System.out.println("Intersection of the lists: ");
        printLinkedList(intersection);
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
    
    public static ListNode findUnion(ListNode head1, ListNode head2) {
        HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        ListNode ptr1 = head1;
        while (ptr1 != null) {
            if (!set.contains(ptr1.val)) {
                set.add(ptr1.val);
                current.next = new ListNode(ptr1.val);
                current = current.next;
            }
            ptr1 = ptr1.next;
        }
        
        ListNode ptr2 = head2;
        while (ptr2 != null) {
            if (!set.contains(ptr2.val)) {
                set.add(ptr2.val);
                current.next = new ListNode(ptr2.val);
                current = current.next;
            }
            ptr2 = ptr2.next;
        }
        
        return dummy.next;
    }
    
    public static ListNode findIntersection(ListNode head1, ListNode head2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        
        ListNode ptr1 = head1;
        while (ptr1 != null) {
            set.add(ptr1.val);
            ptr1 = ptr1.next;
        }
        
        ListNode ptr2 = head2;
        while (ptr2 != null) {
            if (set.contains(ptr2.val)) {
                common.add(ptr2.val);
            }
            ptr2 = ptr2.next;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        for (int num : common) {
            current.next = new ListNode(num);
            current = current.next;
        }
        
        return dummy.next;
    }
}
