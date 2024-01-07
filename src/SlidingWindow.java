
import java.util.*;
public class SlidingWindow {
    static  class Pair implements Comparable<Pair>{
        int value;
        int idx;
        public  Pair(int value,int idx){
            this.idx = idx;
            this.value = value;
        }
        @Override
        public  int compareTo(Pair p2){
            return p2.value - this.value;
        }
    }

    public static void main(String[] args) {

PriorityQueue<Pair> pq =new PriorityQueue<>();
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int res[] = new int[arr.length - k +1];

        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }

        res[0] = pq.peek().value;

        for (int i=k ; i<arr.length;i++){
            while (pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().value;
        }

         for(int i=0;i<res.length;i++){
             System.out.print(res[i]+" ");
         }

    }
}
