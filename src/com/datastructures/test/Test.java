package com.datastructures.test;

public class Test {
    public static boolean foo(String Str) {
        System.out.println(Str);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for (foo("A");foo("B") && i < 2;foo("C")){
            i++;
            foo("D");
        }
    }
}
