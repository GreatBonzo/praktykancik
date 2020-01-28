package com.AdventOfCode4;

//        However, they do remember a few key facts about the password:
//
//        It is a six-digit number.
//        The value is within the range given in your puzzle input.
//        Two adjacent digits are the same (like 22 in 122345).
//        Going from left to right, the digits never decrease; they only ever increase or stay the same
//        (like 111123 or 135679).
//        Other than the range rule, the following are true:
//
//        111111 meets these criteria (double 11, never decreases).
//        223450 does not meet these criteria (decreasing pair of digits 50).
//        123789 does not meet these criteria (no double).
//        How many different passwords within the range given in your puzzle input meet these criteria?
//
//        Your puzzle input is 124075-580769.

public class Main {

    public static void main(String[] args) {

        int dol = 124075;
        int gora = 580769;


        PasswordFinder test = new PasswordFinder(dol, gora);

       int wynik = test.main();
        System.out.println(wynik);


//        Playpen d = new Playpen();
//
//        System.out.println(d.dupa());
    }
}
