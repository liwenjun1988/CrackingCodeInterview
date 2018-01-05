import java.util.HashSet;
import helpers.LinkedListNode;

public void removeDups(LinkedListNode n){
    Hashset<Integer> set = new Hashset<Integer>();
    LinkedListNode previous = null;
    while(n != null){
        if(set.contains(n.data)){
            previous.next = n.next;
        }
    }
} 
