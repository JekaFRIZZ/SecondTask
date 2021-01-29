package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class ChangeSymbolTest {

    @Test
    public void testChangeSymbolShouldChangeSymbolWhenCorrectStringApplied() {
        //given
        ChangeSymbol changeSymbol = new ChangeSymbol();

        //when
        String actual = changeSymbol.changeSymbol("car bus war",2,'d');

        //then
        Assert.assertEquals("cdr bds wdr", actual);
    }

    @Test
    public void testChangeSymbolShouldChangeSymbolWhenStringNotSatisfyCondition() {
        //given
        ChangeSymbol changeSymbol = new ChangeSymbol();

        //when
        String actual = changeSymbol.changeSymbol("car bus war",5,'d');

        //then
        Assert.assertEquals("car bus war", actual);
    }

    @Test(expected = NullPointerException.class)
    public void testChangeSymbolShouldExceptionWhenIncorrectStringApplied() {
        //given
        ChangeSymbol changeSymbol = new ChangeSymbol();
        //when
        String actual = changeSymbol.changeSymbol(null,5,'d');
    }
}
