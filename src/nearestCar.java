import java.util.PriorityQueue;

public class nearestCar {
    static class Pointer implements  Comparable<Pointer>{
        int x;
        int y;
        int dist;
        int idx;
    public  Pointer(int x,int y ,int dist,int idx){
            this.dist = dist;
            this.x = x;
            this.y=y;
            this.idx=idx;

        }
        @Override
        public int compareTo(Pointer p2){
            return this.dist - p2.dist;
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Pointer> p2 = new PriorityQueue<>();
        for (int i=0;i< pts.length;i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            p2.add(new Pointer(pts[i][0],pts[i][1],dist,i));
        }
        for (int i =0;i<k;i++){
            System.out.print("C"+p2.remove().idx+" ");
        }
    }
}
