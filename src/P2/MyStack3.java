package P2;

import java.util.ArrayList;

// 코드 2-12

public class MyStack3<String> extends ArrayList<String> {
    private ArrayList<String> arList = this;

    
    public void push(String element) {
        arList.add(element);
    }
    
    public String pop() {
        return arList.remove(arList.size() - 1);
    }
}