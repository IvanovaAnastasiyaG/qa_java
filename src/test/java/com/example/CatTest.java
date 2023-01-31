package com.example;

import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.*;


public class CatTest {

    @Test
    public void getSoundCatMeow(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(CAT_SOUND,cat.getSound());
    }

    @Test
    public void getFoodCatListFoodOfPredator() throws Exception{
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(PREDATOR_FOOD,cat.getFood());
    }

    @Test
    public void constructorCatEqualsLinkFeline(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(feline, cat.predator);
    }

}






