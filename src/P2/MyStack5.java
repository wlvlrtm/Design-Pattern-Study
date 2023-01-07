package P2;

import java.util.ArrayList;

// 코드 2-14

public class MyStack5<String> {
    private ArrayList<String> arList = new ArrayList<String>();

    
    public void push(String element) {
        arList.add(element);
    }
    
    public String pop() {
        return arList.remove(arList.size() - 1);
    }
    
    public boolean isEmpty() {
        return arList.isEmpty();
    }
    
    public int size() {
        return arList.size();
    }
}