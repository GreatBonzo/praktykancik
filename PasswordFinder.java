package com.AdventOfCode4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PasswordFinder {

    int dolZakresu;
    int goraZakresu;
    Haslo temp = new Haslo();
    Set<Haslo> zgadnieteHasla = new HashSet<>();

    public  PasswordFinder (int dolZakresu, int goraZakresu){
        this.dolZakresu=dolZakresu;
        this.goraZakresu=goraZakresu;
    }


    public int main () {
        int start=0;
        int finish=9;
        ConditionTester ct = new ConditionTester();

        if (Integer.parseInt(temp.toString())<=goraZakresu) {
            for (int a = start; a <= finish; a++) {
                temp.setCyfra1(a);
                if(ct.test(temp, goraZakresu, dolZakresu)) {
                    zgadnieteHasla.add(temp);
                }
                for (int b = start; b <= finish; b++) {
                    temp.setCyfra2(b);
                    if(ct.test(temp, goraZakresu, dolZakresu)) {
                        zgadnieteHasla.add(temp);
                    }
                    for (int c = start; c <= finish; c++) {
                        temp.setCyfra3(c);
                        if(ct.test(temp, goraZakresu, dolZakresu)) {
                            zgadnieteHasla.add(temp);
                        }
                        for (int d = start; d <= finish; d++) {
                            temp.setCyfra4(d);
                            if(ct.test(temp, goraZakresu, dolZakresu)) {
                                zgadnieteHasla.add(temp);
                            }
                            for (int e = start; e <= finish; e++) {
                                temp.setCyfra5(e);
                                if(ct.test(temp, goraZakresu, dolZakresu)) {
                                    zgadnieteHasla.add(temp);
                                }
                                for (int f = start; f <= finish; f++) {
                                    temp.setCyfra6(f);
                                    if(ct.test(temp, goraZakresu, dolZakresu)) {
                                        zgadnieteHasla.add(temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        return zgadnieteHasla.size();
    }
}
