import java.util.ArrayList;

public class IntQueue {
    private ArrayList<Integer> listInts;

    public IntQueue() {
        listInts = new ArrayList<>();
    }

    public void add(int i) {
        listInts.add(i);
    }

    public int remove() {
        int i = listInts.get(0);
        listInts.remove(0);
        return i;
    }

    public boolean isEmpty() {
        return listInts.size() == 0;
    }

    public int peek() {
        return listInts.get(0);
    }

    public String toString() {
        return listInts.toString();
    }
}
