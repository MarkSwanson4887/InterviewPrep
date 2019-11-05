import java.io.*; 
import java.util.*; 

class linkedListPalindrome {
    public static class ListNode {
      int val;
      ListNode next;

      ListNode(int x) { 
          val = x; 
          }
  }
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            q.add(temp.val);
            stack.push(temp.val);
            count++;
            temp = temp.next;
        }
        while(count > 0){
            int poppedval1 = stack.pop();
            int poppedval2 = q.remove();
            if(poppedval1 != poppedval2){
                return false;
            }
            count--;
        }
        return true;
    }
    public static void main(String args[]){
        ListNode object = new ListNode(1);
        object.next = new ListNode(2);
        object.next = new ListNode(3);
        object.next = new ListNode(2);
        object.next = new ListNode(1);
        System.out.println(isPalindrome(object) + ": The answer should be True");
    }
}