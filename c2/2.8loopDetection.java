public LinkedListNode findLoop(LinkedListNode head){
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    
    while(fast != null || slow != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
    
    if(fast == null || fast.next = null){
        return null;
    }
    
    fast = head;
    while(slow!=fast){
        slow = slow.next;
        fast = fast.next;
    }
    return fast;
}
