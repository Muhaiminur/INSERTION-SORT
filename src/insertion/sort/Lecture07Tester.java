package insertion.sort;
public class Lecture07Tester{
  public static void main(String[]args){
    Object[]b={5,7,15,20,13};
    Object[]b1={5,7,12,14,20};
    Node n1=new Node(5, null);
    Node n2=new Node(7,null);
    Node n3=new Node(15, null);
    Node n4=new Node(20,null);
    Node n5=new Node(13, null);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    Node Head=n1;
    
    //Sequential search
    Sequentialsearch abir1=new Sequentialsearch();
    System.out.println("Sequential search");
    System.out.println("For Array");
    System.out.println(abir1.Sequential(b,15));
    System.out.println(abir1.Sequential(b,200));
    System.out.println("For Linked List");
    System.out.println(abir1.SequentialLinked(Head,15));
    System.out.println(abir1.SequentialLinked(Head,200));
    //Binary search
    Binarysearch abir2=new Binarysearch();
    System.out.println("Binary search");
    System.out.println(abir2.Binary(b1,5,20));
    System.out.println(abir2.Binary(b1,5,200));
//    //Bubble sort
//    System.out.println("Bubble Sort Printing");
//    Bubble abir3=new Bubble();
//    abir3.print(abir3.Bubblesort(b));
//    //Selection sort
//    System.out.println("Selection Sort Printing");
//    Selection abir4=new Selection();
//    abir4.print(abir4.Selectionsort(b));
    //Insertion sort
    System.out.println("Insertion Sort Printing");
    Insertion abir5=new Insertion();
    //abir5.print(abir5.Insertionsort(b));
  }
}