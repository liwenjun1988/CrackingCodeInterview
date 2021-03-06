public boolean isPalindrome(LinkedListNode head){
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    
    Stack<Integer> stack = new Stack<Integer>();
    while(fast != null && fast.next != null){
        stack.push(slow.data);
        slow = slow.next;
        fast = fast.next.next;
    }
    if(fast != null){
        slow = slow.next;
    }
    while(slow != null){
        int top = stack.pop().intValue();
        if(top != slow.data){
            return false;
        }
        slow = slow.next;
    }
    return true;
}
