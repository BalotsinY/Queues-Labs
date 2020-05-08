import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PalinList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\Users\\ybalo\\Desktop\\School\\Comp Sci Projects\\Queues Labs\\src\\PalinList.txt"));
        while (scan.hasNext()) {
            System.out.println(palinSplit(scan.nextLine()));
        }
    }

    public static String palinSplit(String s) {
        String[] stuff = s.split(" ");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for (String str : stuff) {
            queue.offer(str);
            stack.push(str);
        }

        String qs = "";
        String ss = "";

        while (!queue.isEmpty()) {
            qs = qs + queue.poll();
        }

        while (!stack.isEmpty()) {
            ss = ss + stack.pop();
        }

        if (qs.equals(ss)) {
            return "[" + s + "]" + " is a palinList";
        } else {
            return "[" + s + "]" + " is not a palinList";
        }
    }
}
