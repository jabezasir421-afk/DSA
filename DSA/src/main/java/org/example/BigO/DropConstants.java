package org.example.BigO;

public class DropConstants {
    /*
   Drop Constant example
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
