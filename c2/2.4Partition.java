public LinkedListNode partition(LinkedListNode node, int n){
    LinkedListNode head = node;
    LinkedListNode tail = node;
    while(node != null){
        if(node.value > n){
            tail.next = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        node = node.next;
    }
    tail.next = null;
    return head;
}
