import java.util.PriorityQueue;

public class objects {
    static class Student implements Comparable<Student>{
        int rank;
        String name;

        Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public  int compareTo(Student s2){
            return  this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A",5));
        pq.add(new Student("C",25));
        pq.add(new Student("R",1));
        pq.add(new Student("Yashwanth ",0));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + "->"+ pq.peek().rank);
            pq.remove();
        }
    }
}
