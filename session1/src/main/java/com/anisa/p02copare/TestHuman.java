package com.anisa.p02copare;

import java.util.Arrays;
import java.util.Comparator;

public class TestHuman {
    public static void main(String[] args) {
        Human[] humans=new Human[]{
                new Human(12,"ali"),
                new Human(14,"ali"),
                new Human(12,"ali"),
                new Human(22,"ali"),
                new Human(32,"ali"),
                new Human(45,"ali"),
        };
        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return 01-02;
            }
        });


        Arrays.sort(humans, (Human o1, Human o2)->  01-02);
    }
}
