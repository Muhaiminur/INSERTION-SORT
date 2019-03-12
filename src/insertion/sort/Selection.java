package insertion.sort;
//Selection sort
public class Selection{
  public Object[] Selectionsort(Object[]b){
    Object[]x=b;
    int c=0;
    while(c<x.length-1){
      int minloc=c;
      Object min=x[c];
      int d=c+1;
      while(d<x.length){
        if(((Comparable)min).compareTo(x[d])>0){
          min=x[d];
          minloc=d;
        }
        d++;
      }
      Object temp=x[c];
      x[c]=x[minloc];
      x[minloc]=temp;
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