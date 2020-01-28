package com.AdventOfCode4;

public class Haslo {

    int cyfra1;
    int cyfra2;
    int cyfra3;
    int cyfra4;
    int cyfra5;
    int cyfra6;

    public void setCyfra1(int cyfra1) {
        this.cyfra1 = cyfra1;
    }

    public void setCyfra2(int cyfra2) {
        this.cyfra2 = cyfra2;
    }

    public void setCyfra3(int cyfra3) {
        this.cyfra3 = cyfra3;
    }

    public void setCyfra4(int cyfra4) {
        this.cyfra4 = cyfra4;
    }

    public void setCyfra5(int cyfra5) {
        this.cyfra5 = cyfra5;
    }

    public void setCyfra6(int cyfra6) {
        this.cyfra6 = cyfra6;
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
}
