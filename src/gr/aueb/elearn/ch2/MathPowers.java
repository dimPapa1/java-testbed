package gr.aueb.elearn.ch2;

import java.util.Scanner;

/**
 * Ypologize to tetragwno kai ton kivo enos aritmou
 * pou dinei o xristis.
 * Xrisimopoiei thn etoimh methodo Math.Pow() ths klasis Math.
 *
 * @author D.Papaioannou
 */
public class MathPowers {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int num;
        int num1 = 10;

        System.out.println("Please give a number");
        num = in.nextInt();

        System.out.printf("Num:%d\t Square:%d\t Cube:%d\t%3d", num, (int)Math.pow(num, 2), (int)Math.pow(num, 3), num1);
        // to (int) einai typecast gia na metatrepsw se int to apotelesma ths Math.pow
        in.close();

    }
}
