package org.example.BigO;

public class DropConstants {
    /*
   Drop Constant example
   here O(n) becomes n+n =2n =n by dropping the constant
    */
    static void main() {
        printNumbers(90);
    }

    public static void printNumbers(int n){
        for (int i =0;i<n;i++){
            System.out.println(i);
        }
        for (int j =0;j<n;j++){
            System.out.println(j);
        }
    }
}
