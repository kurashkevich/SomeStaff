package com.example.archunit.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void sum() {
        Assert.assertEquals(Greeting.sum(2, 4), 6);
    }
}