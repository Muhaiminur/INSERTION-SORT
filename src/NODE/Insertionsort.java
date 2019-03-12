package NODE;
public class Insertionsort{
  public static Node insertionSort(Node head){
    if (head == null || head.next == null){
      return head;
    }
    Node newHead =new Node(head.element,null);
    Node p = head.next;
    while(p!=null){
      Node q = newHead;
      Node next = p.next;
      if(p.element<=newHead.element){
        Node oldHead = newHead;
        newHead = p;
        newHead.next = oldHead;
      }else{
        while(q.next!=null){
          if(p.element>q.element && p.element<=q.next.element){
            Node oldNext = q.next;
            q.next = p;
            p.next = oldNext;
          }
          q = q.next;
        }
        if(q.next==null && p.element>q.element){
          q.next = p;
          p.next = null;
        }
      }
      p = next;
    }
    return newHead;
  }
  public void print(Node h){
      for(Node n=h;n!=null;n=n.next){
        System.out.println(n.element);
      }
    }
}