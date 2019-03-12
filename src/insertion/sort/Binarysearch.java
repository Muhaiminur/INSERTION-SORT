package insertion.sort;
public class Binarysearch{
  //it works if sequence is already sorted
  //use  random access
  //binary search is need log2(n)time
  public Object Binary(Object[]b,int size,Object key){
    int start=0;
    int end=size-1;
    while(start<=end){
      int mid=(start+end)/2;
      if(key.equals(b[mid])){
        return mid;
      }else if(((Comparable)key).compareTo(b[mid])>0){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }
    return -1;
  }
}