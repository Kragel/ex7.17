package com.company;

public class Main {

    public static void main(String[] args) {
        Frog17 f = new Frog17();
        f.swim();
        f.speak();
        f.eat();
        f.grow(f);
        Amphibian.grow(f);
    }
}
