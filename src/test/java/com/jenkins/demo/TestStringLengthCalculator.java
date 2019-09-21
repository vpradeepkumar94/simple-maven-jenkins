package com.jenkins.demo;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStringLengthCalculator {

    private static StringLengthCalculator stringLengthCalculator = null;

    @BeforeClass
    public static void init() {
        stringLengthCalculator = new StringLengthCalculator();
    }

    @Test
    public void testValidStringLength() {
        Assert.assertEquals(4,stringLengthCalculator.findStringLength("Ajay"));
        Assert.assertEquals(5,stringLengthCalculator.findStringLength("Vijay"));
    }

    @Test
    public void testInvalidStringLength() {
        String name = null;
        Assert.assertEquals(-1,stringLengthCalculator.findStringLength(name));
    }
}
