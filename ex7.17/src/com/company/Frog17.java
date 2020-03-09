package com.company;

public class Frog17 extends Amphibian {
    @Override protected void swim()
    {
        System.out.println("Frog swim");
    }
    @Override protected void speak()
    {
        System.out.println("Frog speak");
    }
    @Override void eat()
    {
        System.out.println("Frog eat");
    }
    static void grow(Amphibian a)
    {
        System.out.println("Frog grow");
        a.eat();
    }
}
