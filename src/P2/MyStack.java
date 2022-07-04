package P2;

import java.util.ArrayList;

// 코드 2-10

class MyStack<String> extends ArrayList<String> {
    public void push(String element) {
        add(element);
    }
    
    public String pop() {
        return remove(size() - 1);
    }
}