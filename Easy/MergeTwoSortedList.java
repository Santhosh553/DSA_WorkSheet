import java.util.*;
public class MergeTwoSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first list: ");
        int n = sc.nextInt();
        ListNode list1 = new ListNode(sc.nextInt());
        ListNode temp = list1;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("Enter the number of elements in the second list: ");
        int m = sc.nextInt();
        ListNode list2 = new ListNode(sc.nextInt());
        temp = list2;
        for (int i = 1; i < m; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        sc.close();
    }
}