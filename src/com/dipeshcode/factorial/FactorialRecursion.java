package com.dipeshcode.factorial;
// As in recursion process data are stored in stack.
public class FactorialRecursion {
public int fact(int n){
    if(n==1) return 1; // If input is 1 directly return 1.
    else{
        return n*fact(n-1); // calling same method again and again till final
    }
}

}
