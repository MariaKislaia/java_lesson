package ru.stqa.pft.sandbox;

public class Square1 {
    public double l;

    public Square1 (double l) {
        this.l = l;
    }

    public double perimeter () {
        return this.l + this.l + this.l + this.l;
    }
}
