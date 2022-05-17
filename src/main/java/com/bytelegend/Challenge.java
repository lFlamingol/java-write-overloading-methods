package com.bytelegend;

public class Challenge {

    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static String add(String a, String b, String c) {
        return a + b + c;
    }

    public static int add(int num1, int... nums) {
        int out = num1;
        for (int num: nums) out += num;
        return out;
    }

}
