public class TestQueue {
    public static void main(String[] args) {
        ArrayListQueue<Integer> q = new ArrayListQueue<Integer>(10);
        int element;

        System.out.println("Size of queue is: " + q.size());
        System.out.println("Queue is: " + q);

        if (q.isEmpty())
            System.out.println("Nothing in the queue.");

        try {
            q.dequeue();
        }
        catch (BlankSetException e) {
            System.out.println(e);
        }

        try {
            q.first();
        }
        catch (BlankSetException e) {
            System.out.println(e);
        }

        q.enqueue(1);
        try {
            element = (int) q.first();
            System.out.println("First element of the queue is: " + element);
        }
        catch (BlankSetException e) {
            System.out.println(e);
        }


        System.out.println("Size of queue is: " + q.size());

        try {
            q.dequeue();
        }
        catch (BlankSetException e) {
            System.out.println(e);
        }

        System.out.println("Size of queue is: " + q.size());

        if (q.isEmpty())
            System.out.println("Nothing in the queue.");

        q.enqueue(2);
        q.enqueue(3);

        System.out.println("First element of the queue is: " + q.first());

        System.out.println(q);

        q.dequeue();
        q.dequeue();

        try {
            q.dequeue();
        }
        catch (BlankSetException e) {
            System.out.println(e);
        }

        System.out.println(q);

        for (int i=0; i < 20; i++)
            q.enqueue(i);

        System.out.println(q);

        for (int i=0; i < 25; i++)
            try {
                q.dequeue();
            }
            catch (BlankSetException e) {
                System.out.println(e);
            }
    }
}
