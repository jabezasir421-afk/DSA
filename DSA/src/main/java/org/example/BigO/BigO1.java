package org.example.BigO;

public class BigO1 {
    /*
    this is an example of big Oone
    where only  one operation is performed
    here n grows no of operation stays same
     */
    static void main() {
      int i=  printNumbers(90);
        System.out.println(i);
    }

    public static int printNumbers(int n){
        return n+n;
    }
}
