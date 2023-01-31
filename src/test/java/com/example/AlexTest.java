package com.example;

import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void constructorAlexEqualsLinkFeline() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(alex.feline, feline);
    }

    @Test
    public void constructorAlexIsMale() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(alex.hasMane, ALEX_HAS_MANE);
    }

    @Test
    public void doesHaveManeAlexTrue() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(ALEX_HAS_MANE, alex.doesHaveMane());
    }

    @Test
    public void getFriendsAlexListStringFriends() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(ALEX_FRIENDS, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingAlexZoo() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(ALEX_HOME, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensAlexZero() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(COUNT_ALEX_KITTENS, alex.getKittens());
    }

    @Test
    public void getFoodAlexListFoodOfPredator() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        assertEquals(PREDATOR_FOOD, alex.getFood());
    }

}
