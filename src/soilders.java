import java.util.PriorityQueue;

public class soilders{
    static class Row  implements Comparable<Row> {
        int soldiers;
        int idx;

        Row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;

        }

        @Override
        public int compareTo(Row r2){

            return   this.soldiers == r2.soldiers ? this.idx - r2.idx : this.soldiers - r2.soldiers;
//         if (   this.soldiers == r2.soldiers){
//             return this.idx - r2.idx ;
//         }
//         else{
//             return this.soldiers - r2.soldiers;
//         }

        }
    }

    public static void main(String[] args) {

        int k =2;
        int arr[][] = {{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i =0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<arr[0].length;j++){
          count +=arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count,i));
        }

        for (int i =0; i<k;i++){
            System.out.println("R"+pq.remove().idx);

        }
    }
}
