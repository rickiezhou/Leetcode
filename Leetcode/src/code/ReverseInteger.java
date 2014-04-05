/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;

/**
 *
 * @author Rickie
 */
public class ReverseInteger {
     public int reverse(int x) {
       int n=x;
        boolean neg=false;
        if (n < 0) {neg = true; n = -n;}
        int y = 0;
         while(n!=0){
             if(y<=y*10+n%10)y=10*y+(n%10);//overflow
             else {return(1);}
             n=n/10;
         }   
         if (neg) return -y;
        return y; 
    }
}
