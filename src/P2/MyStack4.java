package P2;

import java.util.ArrayList;

// 코드 2-13

public class MyStack4<String> {
    private ArrayList<String> arList = new ArrayList<String>();

    public void push(String element) {
        arList.add(element);
    }
    
    public String pop() {
        return arList.remove(arList.size() - 1);
    }
}
