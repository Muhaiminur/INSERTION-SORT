package insertion.sort;
//Insertion sort
public class Insertion{
  public Object[] Insertionsort(Object[]b){
    Object[]x=b;
    int c=1;
    while(c<x.length){
      Object temp=x[c];
      int d=c-1;
      while(d>=0 && (((Comparable)temp).compareTo(x[d])>0)){
        x[d+1]=x[d];
        d--;
      }
      x[d+1]=temp;
    }
    return x;
  }
  public void print(Object[]b){
    for(int c=0;c<b.length;c++){
      System.out.println(b[c]);
    }
  }
}