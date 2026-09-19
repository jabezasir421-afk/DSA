package org.example.BigO;

public class DropNonDominants {
    /*
 Drop non-dominant example
 here bigO(n power 2)
 but still the other loop is n but we can't say n2 + n so we drop it and make n2
   */
    static void main() {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.println(i+" "+j);
            }
            for (int k=0;k<n;k++){
                IO.println(k);
            }
        }

    }
}
