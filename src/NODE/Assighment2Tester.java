package NODE;
public class Assighment2Tester{
  public static void main(String[]args){
    //Node head=n1;
    Node n1=new Node(13,null);
    Node n2=new Node(11,null);
    Node n3=new Node(3,null);
    Node n4=new Node(11,null);
    Node n5=new Node(8,null);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    Node head=n1;
    //Selectionsort abir1=new Selectionsort();
    //abir1.sort(head);
    //abir1.print(head);
    Insertionsort abir2=new Insertionsort();
    Node m=abir2.insertionSort(head);
    abir2.print(m);
  }
}