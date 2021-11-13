package com.dipeshcode.stringReverse;

public class ReverseString {
    char eachCharacter;
    String reversed = "";

    public String reverseString(String input){
                    // to get length of string and loop through it
    for (int i=0; i<input.length();i++) {
        eachCharacter = input.charAt(i); // to extract each character
        reversed = eachCharacter + reversed; // to add each character with  reversed one
    }
        return reversed; //return final reversed string
    }




}
