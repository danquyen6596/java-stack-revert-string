package vn.codegym.QuyenLeSy;

public class MyStack<T> {
    private static final int INITIAL_SIZE = 16;
    private	T[]	elements;
    private	int	count	=	0;
    public	MyStack() {
        elements = (T[]) new Object[INITIAL_SIZE];
    }

    public void push(T e){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        elements[count] = e;
        count++;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        T t = elements[count-1];
        elements[count-1] = null;
        count--;
        return t;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (count == INITIAL_SIZE) {
            return true;
        }
        return false;
    }
}
