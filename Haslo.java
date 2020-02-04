package com.AdventOfCode4;

import java.util.Objects;

public class Haslo {

    int cyfra1;
    int cyfra2;
    int cyfra3;
    int cyfra4;
    int cyfra5;
    int cyfra6;

    public void setAll (int c1, int c2, int c3, int c4, int c5, int c6){
        setCyfra1(c1);
        setCyfra2(c2);
        setCyfra3(c3);
        setCyfra4(c4);
        setCyfra5(c5);
        setCyfra6(c6);
    }

    public void setCyfra1(int cyfra1) {
        if(cyfra1<10)
        this.cyfra1 = cyfra1;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public void setCyfra2(int cyfra2) {
        if(cyfra2<10)
            this.cyfra2 = cyfra2;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public void setCyfra3(int cyfra3) {
        if(cyfra3<10)
            this.cyfra3 = cyfra3;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public void setCyfra4(int cyfra4) {
        if(cyfra4<10)
            this.cyfra4 = cyfra4;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public void setCyfra5(int cyfra5) {
        if(cyfra5<10)
            this.cyfra5 = cyfra5;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public void setCyfra6(int cyfra6) {
        if(cyfra6<10)
            this.cyfra6 = cyfra6;
        else System.out.println("Cyfry sa od 1-9 kolego");
    }

    public int getCyfra1() {
        return cyfra1;
    }

    public int getCyfra2() {
        return cyfra2;
    }

    public int getCyfra3() {
        return cyfra3;
    }

    public int getCyfra4() {
        return cyfra4;
    }

    public int getCyfra5() {
        return cyfra5;
    }

    public int getCyfra6() {
        return cyfra6;
    }

    @Override
    public String toString() {
        return Integer.toString(cyfra1) + cyfra2 +
                cyfra3 + cyfra4 +
                cyfra5 + cyfra6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Haslo haslo = (Haslo) o;
        return cyfra1 == haslo.cyfra1 &&
                cyfra2 == haslo.cyfra2 &&
                cyfra3 == haslo.cyfra3 &&
                cyfra4 == haslo.cyfra4 &&
                cyfra5 == haslo.cyfra5 &&
                cyfra6 == haslo.cyfra6;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cyfra1, cyfra2, cyfra3, cyfra4, cyfra5, cyfra6);
    }
}
