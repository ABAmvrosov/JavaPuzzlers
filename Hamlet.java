package net.aab.JavaPuzzlers;

import java.util.Random;

public class Hamlet {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean toBe = rnd.nextBoolean();
        Number result = (toBe || !toBe) ? new Integer(3) : new Float(1);
        System.out.println(result);
    }
}
