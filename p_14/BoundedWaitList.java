package practice_14;
// BoundedWaitList: Список ожидания - огр. емкость(изн.зад)
class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity;
    }
}