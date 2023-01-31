package com.example;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import static com.example.Constants.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    Feline family;
    String sex;
    Boolean hasMane;

    public LionTest(Feline feline, String sex, boolean hasMane){
        this.sex = sex;
        this.family = feline;
        this.hasMane = hasMane;

    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                { new Feline(), FEMALE, false },
                { new Feline(), MALE, true },
        };
    }

    @Test
    public void constructorLionHasMane() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(hasMane, lion.hasMane);
    }

    @Test
    public void constructorLionIsFeline() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(lion.feline, family);
    }

    @Test
    public void doesHaveManeLion() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFoodLionListFoodOfPredator() throws Exception{
        Lion lion = new Lion(family, sex);
        assertEquals(PREDATOR_FOOD, lion.getFood());
    }

    @Test
    public void getKittensLionDefaultOne() throws Exception{
        Lion lion = new Lion(family, sex);
        assertEquals(COUNT_KITTENS_INIT_VALUE, lion.getKittens());
    }
}
