import java.util.ArrayList;
import java.util.PriorityQueue;

public class addElem {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);          //O(1)

            int x = arr.size() - 1;
            int par = (x-1)/ 2;

            while(arr.get(x) < arr.get(par)){
                int temp =arr.get(x);          //O(logn)
                arr.set(par,temp);
            }
        }
        public  int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {

        }
    }

