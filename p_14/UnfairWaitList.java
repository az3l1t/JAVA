package practice_14;
//можно удалить элемент,
//который не является первым в очереди
class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) { //{x,3,2} -> {3,2,x}
        if (content.remove(element)) {
            content.add(element);
        }
    }
}