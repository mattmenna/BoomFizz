package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoomFizzTest {
    @Test
    public void boom() throws Exception {
        BoomFizz boomFizz = new BoomFizz();
        String expected= "1";
        String actual = boomFizz.boom(1);
        //assertion
        assertEquals("Your Code Sucks!", expected, actual);
    }


}