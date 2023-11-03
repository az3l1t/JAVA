package second;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}