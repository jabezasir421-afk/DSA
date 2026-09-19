package org.example.BigO;

public class BigONsq {
    /*
  BigO(n power of 2) example
   */
    static void main() {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
