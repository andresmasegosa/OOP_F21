package session6.a_generics.stack;

public class DemoStack {

    public static void main(String[] args) {
        Stack<Giraff> stack = new Stack<>();

        Giraff giraff1 = new Giraff();

        stack.push(giraff1);

        Giraff giraff2 = stack.pop();

    }

}
