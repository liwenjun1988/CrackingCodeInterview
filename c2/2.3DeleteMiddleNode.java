public boolean deleteMiddleNode(LinkedListNode n){
    if(n == null || n.next == null){
        return false;
    }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = n.next.next;
    return true;
}
