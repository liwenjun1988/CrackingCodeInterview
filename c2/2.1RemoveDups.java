import java.util.HashSet;
import helpers.LinkedListNode;

//with extra space
public void removeDups1(LinkedListNode n){
    Hashset<Integer> set = new Hashset<Integer>();
    LinkedListNode previous = null;
    while(n != null){
        if(set.contains(n.data)){
            previous.next = n.next;
        }else{
            set.add(n.data);
            previous = n;
        }                
        n = n.next;
    }
} 

//without extra space
public void removeDups2(LinkedlistNode n){
    while(n != null){
        LinkedListNode runner = n;
        while(runner.next != null){
            if(runner.next.data == n.data){
                runner.next = runner.next.next;
            }else{
                runner = runner.next;
            }
        }
        n = n.next;
    }
}
