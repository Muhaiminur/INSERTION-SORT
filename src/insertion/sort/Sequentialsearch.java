package insertion.sort;
public class Sequentialsearch{
  //Sorted array na holeo hbe
  //does not required any RAM
  // requires n comparisons in the worst-case
  public Object Sequential(Object[]b,int key){
    for(int c=0;c<b.length;c++){
      if((int)b[c]==key){
        return c;
      }
    }
    return -1;
  }
  public Object SequentialLinked(Node h,Object key){
    int count=0;
    Node m=h;
    for(Node n=m;n!=null;n=n.next,count++){
      if(n.ele==key){
        return count;
      }
      
    }
    return -1;
  }
}