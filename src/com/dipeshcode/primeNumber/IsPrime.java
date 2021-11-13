package com.dipeshcode.primeNumber;

public class IsPrime {
    int i;

    // First method to find prime number (n)
    public boolean isPrime(int n){
        for(i=2 ; i<n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Second method to find prime number (n/2)
    public boolean isPrime2(int n){
        for (i=2 ; i< n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //Third method to calculate prime number (n*n)

    public boolean isPrime3(int n){
        for (i=2 ; i<n*n ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
