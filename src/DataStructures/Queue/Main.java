package DataStructures.Queue;

public class Main {
    public static void main(String[] args){
        //FIFO

        Queue myQueue = new Queue(2);
        myQueue.enqueue(3);
        myQueue.dequeue();

        myQueue.printQueue();


    }
}
