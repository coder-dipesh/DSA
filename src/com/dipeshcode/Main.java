package com.dipeshcode;

import com.dipeshcode.arrayReverse.ReverseArray;
import com.dipeshcode.factorial.Factorial;
import com.dipeshcode.factorial.FactorialRecursion;
import com.dipeshcode.numberReverse.ReverseNumber;
import com.dipeshcode.primeNumber.IsPrime;
import com.dipeshcode.stringReverse.ReverseString;

public class Main {

    public static void main(String[] args) {
          // PRIME NUMBER
          IsPrime prime1 = new IsPrime();
//        System.out.println(prime1.isPrime(999999999));
//        System.out.println(prime1.isPrime2(999999999));
//        System.out.println(prime1.isPrime3(999999999));

        //INTEGER REVERSE
        ReverseNumber rev = new ReverseNumber();
//      System.out.println(rev.reverseNumber(12341));

        //STRING REVERSE
        ReverseString str = new ReverseString();
//      System.out.println(str.reverseString("hsepid"));

        //ARRAY REVERSED
        ReverseArray arr = new ReverseArray();
//        arr.reverseArray();

        // Factorial Recursion

        FactorialRecursion fact = new FactorialRecursion();
//        System.out.println(fact.fact(20));

        //Factorial

        Factorial factor = new Factorial();
//        System.out.println(factor.factorial(20));
    }
}
