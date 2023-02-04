package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Constants.PREDATOR;
import static com.example.Constants.SEX_ERROR_TEXT;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTestException {
    @Mock
    Feline family;
    @Test
    public void constructorLionNewException() {
        String errorSex =  PREDATOR;
        Exception thrown = Assert.assertThrows(Exception.class,() -> new Lion(family,errorSex));
        assertEquals(SEX_ERROR_TEXT, thrown.getMessage());
    }
}
