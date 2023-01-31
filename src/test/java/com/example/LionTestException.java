package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LionCheckException {

    @Test
    public void constructorLionNewException(){
        String sexLion = "Male";
        Feline family = new Feline();
        Exception thrown = Assert.assertThrows(Exception.class,() -> new Lion(family,sexLion));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());

    }

    @Test
    public void constructorLionNullException(){
        String sexLion = "Male";
        Exception thrown = Assert.assertThrows(Exception.class,() -> new Lion(null,sexLion));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());

    }


}
