package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static com.example.Constants.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    String sex;
    Boolean hasMane;
    @Mock
    Feline family;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                { FEMALE, false },
                { MALE, true },
        };
    }

    @Test
    public void constructorLionIsFeline() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(family, lion.feline);
    }

    @Test
    public void constructorLionHasMane() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(hasMane, lion.hasMane);
    }

    @Test
    public void doesHaveManeLion() throws Exception {
        Lion lion = new Lion(family, sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFoodLionListFoodOfPredator() throws Exception{
        Mockito.when(family.getFood(PREDATOR)).thenReturn(PREDATOR_FOOD);
        Lion lion = new Lion(family, sex);
        assertEquals(PREDATOR_FOOD, lion.getFood());
    }

    @Test
    public void getKittensLionDefaultOne() throws Exception{
        Mockito.when(family.getKittens()).thenReturn(NUMB_FELINE_KITTENS_DEFAULT);
        Lion lion = new Lion(family, sex);
        assertEquals(NUMB_FELINE_KITTENS_DEFAULT, lion.getKittens());
    }
}
