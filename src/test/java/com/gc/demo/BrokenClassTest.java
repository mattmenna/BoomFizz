package com.gc.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokenClassTest {

    @Before
    public BrokenClass setUp() throws Exception {
        return new BrokenClass();
    }

    @Test
    public void isCardAMatch() throws Exception {
        String input1="test";
        String input2="test2";
        assertFalse(setUp().isCardAMatch(input1, input2));
    }

    @Test
    public void baseEncodeFileName() throws Exception {
    }

    @Test
    public void roundUp() throws Exception {
    }

    @Test
    public void sum() throws Exception {
        assertEquals(3,setUp().sum(1,2),0);
    }

}