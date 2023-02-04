package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Constants.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void constructorAlexEqualsLinkFeline() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(feline, alex.feline);
    }

    @Test
    public void constructorAlexIsMale() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(ALEX_HAS_MANE, alex.hasMane);
    }

    @Test
    public void doesHaveManeAlexTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(ALEX_HAS_MANE, alex.doesHaveMane());
    }

    @Test
    public void getFriendsAlexListStringFriends() throws Exception{
        Alex alex = new Alex(feline);
        assertEquals(ALEX_FRIENDS, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingAlexZoo() throws Exception{
        Alex alex = new Alex(feline);
        assertEquals(ALEX_HOME, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensAlexZero() throws Exception{
        Alex alex = new Alex(feline);
        assertEquals(NUMB_ALEX_KITTENS, alex.getKittens());
    }

    @Test
    public void getFoodAlexListFoodOfPredator() throws Exception{
        Mockito.when(feline.getFood(PREDATOR)).thenReturn(PREDATOR_FOOD);
        Alex alex = new Alex(feline);
        assertEquals(PREDATOR_FOOD, alex.getFood());
    }

}
