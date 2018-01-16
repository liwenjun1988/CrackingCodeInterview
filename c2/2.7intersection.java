class Result{
    public LinkedListNode tail;
    public int size;
    public Result(LinkedListNode tail, int size){
        this.tail = tail;
        this.size = size;
    }
}

private Result getTailandSize(LinkedListNode head){
    if(head == null){
        return null;
    }
    int size = 1;
    LinkedListNode current = head;
    while(current.next != null){
        size ++;
        current = current.next;
    }
    return new Result(current, size);
}


public LinkedListNode isIntersection(LinkedListNode l1, LinkedListNode l2){
    if(l1 == null || l2 == null){
        return null;
    }
    
    Result result1 = getTailandSize(l1);
    Result result2 = getTailandSize(l2);
    
    if(result1.tail != result2.tail){
        return null;
    }
    
    LinkedListNode longer = result1.size > result2.size? list1 : list2;
    LinkedListNode shorter = result1.size > result2.size? list2: list1;
    
    int k = Math.abs(result1.size - result2.size);
    while(k > 0){
        longer = longer.next;
        k--;
    }
    while(shorter != longer){
        shorter = shorter.next;
        longer = longer.next;
    }
    return longer;
}
