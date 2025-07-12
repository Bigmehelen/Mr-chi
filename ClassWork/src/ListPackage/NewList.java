package ListPackage;

public class NewList {
    private String[] myList;
    private int count;

    public NewList(int size) {
        myList = new String[size];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(String element) {
            myList[count++] = element;
    }

    public String remove(String element) {
        for (int i = 0; i < count; i++) {
            if (myList[i].equals(element)) {
                for (int j = i; j < count - 1; j++) {
                    myList[j] = myList[j + 1];
                }
                myList[count - 1] = null;
                count--;
                return element;
            }
        }
        return null;
    }

    public int size() {
        return count;
    }
}