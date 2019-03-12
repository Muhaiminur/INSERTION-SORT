package insertion.sort;
public class Bubble{
  public Object[] Bubblesort(Object[]b){
    Object[]x=b;
    int c=0;//sorting
    while(c<x.length-1){
      int d=0;
      while(d<x.length-c-1){
        if(((Comparable)x[d]).compareTo(x[d+1])>0){
          Object temp=x[d];
          x[d]=x[d+1];
          x[d+1]=temp;
        }
        d++;
      }
      c++;
    }
    return x;
  }
  public void print(Object[]b){
    for(int c=0;c<b.length;c++){
      System.out.println(b[c]);
    }
  }
}
    