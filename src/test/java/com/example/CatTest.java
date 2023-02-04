package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Constants.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCatMeow(){
        Cat cat = new Cat(feline);
        assertEquals(CAT_SOUND,cat.getSound());
    }

    @Test
    public void getFoodCatListFoodOfPredator() throws Exception{
        Mockito.when(feline.eatMeat()).thenReturn(PREDATOR_FOOD);
        Cat cat = new Cat(feline);
        assertEquals(PREDATOR_FOOD,cat.getFood());
    }

    @Test
    public void constructorCatEqualsLinkFeline(){
        Cat cat = new Cat(feline);
        assertEquals(feline, cat.predator);
    }

}






