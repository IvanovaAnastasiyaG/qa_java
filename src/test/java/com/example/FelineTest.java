package com.example;

import org.junit.Assert;
import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatFelineListFoodOfPredator() throws Exception{
        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }

    @Test
    public void getFoodPredatorListFoodPredator() throws Exception {
        assertEquals(PREDATOR_FOOD, feline.getFood(PREDATOR));
    }

    @Test
    public void getFoodHerbivoreListFoodHerbivore() throws Exception {
        assertEquals(HERBIVORE_FOOD, feline.getFood(HERBIVORE));
    }

    @Test
    public void getFoodErrorFamilyException(){
        String errorFamily = MALE;
        Exception thrown = Assert.assertThrows(Exception.class,() -> feline.getFood(errorFamily));
        assertEquals(FAMILY_ERROR_TEXT, thrown.getMessage());

    }

    @Test
    public void getFamilyFelineEqualsFeline() {
        assertEquals(FELINE, feline.getFamily());
    }

    @Test
    public void getKittensNullReturnOne() {
        assertEquals(NUMB_FELINE_KITTENS_DEFAULT, feline.getKittens());
    }
}
