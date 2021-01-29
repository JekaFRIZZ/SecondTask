package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class RemoverWordsTest {

    @Test
    public void testRemoverWordsShouldNotRemoveWordsWhenCorrectStringApplied() {
        //given
        RemoverWords removerWords = new RemoverWords();
        //when
        String actual = removerWords.removerWords("car bus war", 3);
        //then
        Assert.assertEquals("car bus war", actual);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoverWordsShouldExceptionWhenIncorrectStringApplied() {
        //given
        ChangeSymbol changeSymbol = new ChangeSymbol();
        //when
        String actual = changeSymbol.changeSymbol(null,5,'d');
    }
}
