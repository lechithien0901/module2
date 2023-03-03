package ss013_real_match_search.pratice;
public class BinarySearch {

static int[] list={2,4,7,10,11,45,50,59,60,66,69,70,79};
static int BinarySearch(int [] list,int key){
      int low=0;
      int height= list.length-1;
      while(height>=low){
              int mid=(low+height)/2;
              if (list[mid]>key){
                      height=mid-1;
              }
              else if (list[mid]<key){
                      low=mid+1;
              }
              else{
                      return mid;
              }

      }
      return -1;
        }

        public static void main(String[] args) {
                System.out.println(BinarySearch(list,79));
        }}

