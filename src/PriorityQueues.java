import java.util.Comparator;
import  java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(8);        // Comparator reverse to get descending order
        pq.add(1);
        pq.add(2);

        while (!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }

    }
}
