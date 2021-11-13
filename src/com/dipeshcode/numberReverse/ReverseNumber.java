package com.dipeshcode.numberReverse;

public class ReverseNumber {

    public int reverseNumber(int number){
        int reversed=0;

        while(number >=1){
            int lastDigit = number%10; // getting last digit from number
            reversed = reversed * 10 + lastDigit; // reversing each digits
            number= number/10; // To remove last digit from the given number
        }

        return reversed;
    }





}
