class mergeTwoSortedLists{

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x){ 
            val = x;
        }
  }
    public static ListNode add(ListNode list, int data){
        ListNode toAdd = new ListNode(data);
        ListNode head = list;
        if(head == null){
            head = toAdd;
        }
        while(head.next != null){
            head = head.next;
        }
        head.next = toAdd;
        return head;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(1);
        while(l1 != null || l2 != null){
            if(l1 == null){
                add(list,l2.val);
                l2 = l2.next;
            }
            else if(l2 == null){
                add(list,l1.val);
                l1 = l1.next;
            }
            else if(l1.val < l2.val){
                add(list, l1.val);
                l1 = l1.next;
            }
            else{
                add(list,l2.val);
                l2 = l2.next;
            }
        }
        return list.next;
    }
    public static void main(String args[]){
        ListNode testNode1 = new ListNode(2);
        add(testNode1,4);
        ListNode testNode2 =  new ListNode(1);
        add(testNode2,3);
        add(testNode2,4);
        System.out.println(mergeTwoLists(testNode1,testNode2));
    }
}