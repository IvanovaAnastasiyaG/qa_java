package com.example;

import org.junit.Assert;
import org.junit.Test;

import static com.example.Constants.SEX_ERROR_TEXT;
import static org.junit.Assert.*;

public class LionTestException {

    @Test
    public void constructorLionNewException(){
        String sexError = "Male";
        Feline family = new Feline();
        Exception thrown = Assert.assertThrows(Exception.class,() -> new Lion(family,sexError));
        assertEquals(SEX_ERROR_TEXT, thrown.getMessage());

    }

}
