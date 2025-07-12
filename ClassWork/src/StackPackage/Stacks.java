package StackPackage;

import java.util.EmptyStackException;

public class Stacks {
    private boolean isEmpty = true;
    private String[] entries;
    private int count;

    public Stacks(int size){
        entries = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void pushElement(String elements) {
        entries[count++] = elements;
    }

    public String popElement() {
        if (count == 0){
            throw new IllegalStateException("Stack is empty");
        }
        return entries[count--] = "dancing";
    }
}
