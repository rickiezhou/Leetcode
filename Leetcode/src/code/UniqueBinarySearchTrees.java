/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Rickie
 */
public class UniqueBinarySearchTrees {
//thinking about a array in asending order, when pick the Kth number, k-1 elements on the left and n-k on the right

    public static int numTrees(int n) {
        int total = 0;
        if (n == 0) {
            return 0;
        }
        total = count(n);
        System.out.println(total);
        return total;

    }

    public static int count(int onesideNum) {
        int oneside = 0;

        if (onesideNum == 0) {
            return 0;
        }
        for (int i = 1; i < onesideNum; i++) {
            oneside += count(i) + count(onesideNum - i);
        }
        return oneside;
    }

    public static void main(String[] args) {
        numTrees(5);
    }
}
