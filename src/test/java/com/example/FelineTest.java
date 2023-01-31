package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Constants.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatFelineListFoodOfPredator() throws Exception{
        Feline feline = new Feline();
        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }

    @Test
    public void getFamilyFelineEqualsFeline() {
        Feline feline = new Feline();
        assertEquals(FELINE, feline.getFamily());
    }

    @Mock
    Feline felineMock;

    @Test
    public void getKittensOneInitValue() {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        assertEquals(COUNT_KITTENS_INIT_VALUE, felineMock.getKittens());
    }

    @Test
    public void getKittensSixSurviveThree() {
        Mockito.when(felineMock.getKittens(6)).thenReturn(3);
        assertEquals(AVERAGE_SURVIVE_KITTENS, felineMock.getKittens(6));
    }

    @Test
    public void getKittensMinusOneMinValueZero() {
        Mockito.when(felineMock.getKittens(-1)).thenReturn(0);
        assertEquals(COUNT_KITTENS_MIN_VALUE, felineMock.getKittens(-1));
    }
}
