package session6.a_generics.a_generics.stack;

public class Stack<T> {
    private T[] stack;
    int count=0;

    public Stack() {
        stack = (T[]) new Object[100];
    }

    T pop() {
        return stack[-1];
    }
    void push(T o) {
        stack[count++]=o;
    }
}