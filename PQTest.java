import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PQTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner (new File("C:\\Users\\ybalo\\Desktop\\School\\Comp Sci Projects\\Queues Labs\\src\\priorityData.txt"));
        while(scan.hasNext()) {
            System.out.println(priorityTarget(scan.nextLine()));
        }
    }

    private static String priorityTarget(String nextLine) {
        String [] temp = nextLine.split(" ");

        PriorityQueue<String> pq = new PriorityQueue<>();

        for (String s : temp) {
            pq.add(s);
        }

        String output = "";

        output += "toString() : " + pq.toString() + "\n";
        output += "min : " + pq.peek() + "\n";
        output += "natural order : ";
        while (!pq.isEmpty()) {
            output += pq.remove() + " ";
        }
        output += "\n";

        return output;
    }
}

