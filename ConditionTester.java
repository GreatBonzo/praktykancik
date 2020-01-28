package com.AdventOfCode4;

public class ConditionTester {

    public boolean test (Haslo temp, int goraZakresu, int dolZakresu){

        boolean wynik;

        wynik = (
                        temp.getCyfra1() == temp.getCyfra2() |
                        temp.getCyfra2() == temp.getCyfra3() |
                        temp.getCyfra3() == temp.getCyfra4() |
                        temp.getCyfra4() == temp.getCyfra5() |
                        temp.getCyfra5() == temp.getCyfra6()
                )
                &
                (
                        temp.getCyfra1() <= temp.getCyfra2() &
                        temp.getCyfra2() <= temp.getCyfra3() &
                        temp.getCyfra3() <= temp.getCyfra4() &
                        temp.getCyfra4() <= temp.getCyfra5() &
                        temp.getCyfra5() <= temp.getCyfra6()
                )
                &
                (
                        Integer.parseInt(temp.toString()) <= goraZakresu
                )
                &
                (
                        Integer.parseInt(temp.toString()) >= dolZakresu
                );




        return wynik;
    }
}
