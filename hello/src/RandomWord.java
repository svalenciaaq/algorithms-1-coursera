/* *****************************************************************************
 *  Name:              Santiago valencia
 *  Last modified:     February 28, 2024
 **************************************************************************** */



import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {

    public static void main(String[] args) {
        int index = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean accept = StdRandom.bernoulli(1 / (index + 1.0));
            if (accept) {
                champion = word;
            }
            index++;
        }
        StdOut.println(champion);


    }
}
