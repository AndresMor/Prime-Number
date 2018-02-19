/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Prime_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        if (isPrime(num)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
        
    }
    public static boolean isPrime(BigInteger num){
        BigInteger i = BigInteger.valueOf(3);
        if (num.compareTo(BigInteger.valueOf(2))==0) {
            return true;
        }else if(num.compareTo(BigInteger.ZERO)==0 || num.compareTo(BigInteger.ONE)==0){
            return false;
        }else{
            while(i.compareTo(num)<0){
                if (num.mod(i).compareTo(BigInteger.ZERO) == 0) {
                    break;
                }
                i = i.add(BigInteger.valueOf(2));
            }
            if (i.compareTo(num)==0) {
                return true;
            }else{
                return false;
            }
        }
    }
}
