package com.dipeshcode.arrayReverse;

public class ReverseArray {
    int coll[]= {1,2,3,4,5,6,7}; // predefining the array

    public void reverseArray(){
        for(int i=0; i<coll.length; i++){ // printing normal array
            System.out.print(coll[i]);
        }

        System.out.println("");
        System.out.println("Reversed array:");
        // printing reversed array
        for (int i= coll.length-1; i>=0;i--){ // we go in backward direction to reverse array
            System.out.print(coll[i]);
        }
    }

}
