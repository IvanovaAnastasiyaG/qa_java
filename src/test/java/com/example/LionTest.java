package com.example;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTests {

    Feline family;
    String sexLion;
    Boolean hasMane;
    Boolean isFeline;
    Boolean isPredator;
    int defaultContKitten;

    public LionTests(Feline feline, String sexLion, boolean hasMane, boolean isFeline, boolean isPredator, int defaultContKitten){
        this.sexLion = sexLion;
        this.family = feline;
        this.hasMane = hasMane;
        this.isFeline = isFeline;
        this.isPredator = isPredator;
        this.defaultContKitten = defaultContKitten;

    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                { new Feline(), "Самка", false, true, true, 1},
                { new Feline(), "Самец", true, true, true, 1},
        };
    }

    @Test
    public void constructorLionHasMane() throws Exception {
        Lion lion = new Lion(family,sexLion);
        assertEquals(hasMane, lion.hasMane);
    }

    @Test
    public void constructorLionIsFeline() throws Exception {
        Lion lion = new Lion(family,sexLion);
        assertEquals(isFeline,lion.feline == family);
    }

    @Test
    public void doesHaveManeLion() throws Exception {
        Lion lion = new Lion(family,sexLion);
        assertEquals(hasMane, lion.hasMane);
    }

    @Test
    public void getFoodLionListFoodOfPredator() throws Exception{
        Lion lion = new Lion(family,sexLion);
        List<String> lionFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(isPredator, lionFood.equals(lion.getFood()));
    }

    @Test
    public void getKittensLionDefaultOne() throws Exception{
        Lion lion = new Lion(family,sexLion);
        assertEquals(defaultContKitten, lion.getKittens());
    }
}
