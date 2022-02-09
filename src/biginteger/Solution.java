package biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
         BigInteger x = new BigInteger(sc.next());
         BigInteger y = new BigInteger(sc.next());


         BigInteger add = x.add(y);
         BigInteger mult = x.multiply(y);

         System.out.println(add);
         System.out.println(mult);

        /*Scanner scan = new Scanner(System.in);
        BigInteger first = new BigInteger(scan.next());
        BigInteger second = new BigInteger(scan.next());*/

        /*System.out.println(first.add(second));
        System.out.println(first.multiply(second));*/

    }
}