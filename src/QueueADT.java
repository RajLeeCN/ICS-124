public interface QueueADT<T> {

    public void enqueue(T element);

    public T dequeue() throws BlankSetException;

    public T first() throws BlankSetException;

    public boolean isEmpty();

    public int size();

    public String toString();
}