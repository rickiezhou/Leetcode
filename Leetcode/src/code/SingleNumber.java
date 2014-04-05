/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Set;

/**
 *
 * @author Rickie
 */
public class SingleNumber {

    int[] A;

//s1
    public int findSingle1() {
        int single = 0;
        for (int i : A) {
            single ^= i;
        }
        return single;
    }
    //s2 best:结合律：A^B^C=(A^B)^C

    int singleNumber(int A[]) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int n =A.length;
        while (--n != 0) {
            A[n - 1] ^= A[n];
        }
        return A[0];
    }
}
