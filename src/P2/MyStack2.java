package P2;

import java.util.ArrayList;

// 코드 2-11

public class MyStack2<String> extends ArrayList<String> {
    private ArrayList<String> arList = this;

    public void push(String element) {
        add(element);
    }
    
    public String pop() {
        return remove(size() - 1);
    }
}