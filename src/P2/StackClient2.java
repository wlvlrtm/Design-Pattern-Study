package P2;

//코드 2-5

public class StackClient2 {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        st.push(20);
        System.out.print(st.peek());
    }
}