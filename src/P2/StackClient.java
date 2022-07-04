package P2;

// 코드 2-4

public class StackClient {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        st.itemArray[++st.top] = 20;
        System.out.print(st.itemArray[st.top]);
    }
}