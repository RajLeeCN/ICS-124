import java.util.ArrayList;

public class ArrayListQueue<T> implements QueueADT<T> {
    //<E> is important, that means generics
    private final ArrayList<T> sizeOfArrayList;

    public ArrayListQueue(int size) {
        this.sizeOfArrayList = new ArrayList<>(size);
    }
//constructor used to initialize the size of the ArrayList, so it's int instead of Integer;
    @Override
    public void enqueue(T element) {
        sizeOfArrayList.add(element);
    }

    @Override
    public T dequeue() throws BlankSetException {
        if (sizeOfArrayList.isEmpty()) {
            throw new BlankSetException("queue");
        }
        return sizeOfArrayList.remove(0);

    }

    @Override
    public T first() {
        if (sizeOfArrayList.isEmpty()) {
            throw new BlankSetException("queue");
        }
        return sizeOfArrayList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return sizeOfArrayList.isEmpty();
    }

    @Override
    public int size() {
        return sizeOfArrayList.size();
    }

    @Override
    public String toString() {
        if (sizeOfArrayList.isEmpty())
            return "empty.";
        else {

            System.out.print("Queue is: ");
            for (int i = 0; i < sizeOfArrayList.size() - 1; i++) {
                System.out.print(sizeOfArrayList.get(i) + ", ");
            }
            System.out.print(sizeOfArrayList.get(sizeOfArrayList.size() - 1));
        }
        return "";
    }
}