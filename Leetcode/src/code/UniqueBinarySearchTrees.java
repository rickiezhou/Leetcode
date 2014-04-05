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
    static int[] cache;
    public static int numTrees(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        cache = new int[n + 1];
        return count(n);
    }
    
    public static int count(int onesideNum) {
       
        if (onesideNum == 0) {
            return 1;
        }
        if (onesideNum == 1) {
            return 1;
        }
        if (cache[onesideNum] != 0) {
          return cache[onesideNum];
       }
         int oneside = 0;
        for (int i = 0; i < onesideNum; i++) {

            oneside += count(i) * count(onesideNum - i - 1);
        }
       cache[onesideNum] = oneside;
        return oneside;
    }

    public static void main(String[] args) {

          System.out.println(numTrees(2));
    }
}
