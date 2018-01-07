Class LinkedListNode{
    LinkedListNode next;
    int value;
    LinkedListNode(int v){
        this.value = v;
        this.next = null;
    }
}

public int returnKthToLast(LinkedListNode head, int k){
    if(head == null){
        return 0;
    }
    LinkedListNode a = head;
    LinkedListNode b = head;
    int index = 0;
    while(index != k){
        if(b = null) return null;
        b = b.next;
        index ++;
    }
    while(b != null){
        b = b.next;
        a = a.next;
    }
    return a;
}
