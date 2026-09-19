package org.example.BigO;

public class BigO {

    /*
    Big O(n) example
     */
    static void main() {
        printNumbers(90);
    }

    public static void printNumbers(int n){
        for (int i =0;i<n;i++){
            System.out.println(i);
        }
    }
}
