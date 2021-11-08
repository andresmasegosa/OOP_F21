package session6.a_generics.stack;

public class Stack<T> {
    private T[] stack;
    int count=0;

    public Stack() {
        stack = (T[]) new Object[100];
    }

    T pop() {
        return stack[--count];
    }
    void push(T o) {
        stack[count++]=o;
    }
}