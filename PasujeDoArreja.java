package com.AdventOfCode3;

import java.util.Objects;

public class PasujeDoArreja {

    int wartoscX;
    int wartoscY;

    public void setWartoscX(int wartoscX) {
        this.wartoscX = wartoscX;
    }

    public void setWartoscY(int wartoscY) {
        this.wartoscY = wartoscY;
    }

    public int getWartoscX() {
        return wartoscX;
    }

    public int getWartoscY() {
        return wartoscY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasujeDoArreja that = (PasujeDoArreja) o;
        return wartoscX == that.wartoscX &&
                wartoscY == that.wartoscY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartoscX, wartoscY);
    }
}
