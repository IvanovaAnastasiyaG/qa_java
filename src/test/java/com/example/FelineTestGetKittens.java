package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestGetKittens {

    int numb_kittens;
    Feline feline = new Feline();

    public FelineTestGetKittens(int numb_kittens){
        this.numb_kittens = numb_kittens;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                { -2147483648 },
                { 2147483647 },
                { -21474836 },
                { 21474836 },
                { 0 },
                { -1 },
                { 1 },
        };
    }

    @Test
    public void constructorLionIsFeline() {
        assertEquals(numb_kittens, feline.getKittens(numb_kittens));
    }
}
