package com.dipeshcode.factorial;

public class Factorial {
int fact=1;
public int factorial(int n){
    if(n==1) return 1; // If input is 1 return 1.
    else{
        for (int i=2; i<=n ; i++ ){ // start from 2 and run till i==n or i<n
            fact= fact*i;
        }
        return fact;
    }
}
}