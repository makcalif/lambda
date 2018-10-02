package com.list.max;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;

public class MaxLenInListTest {

    File file;

    @Before
    public void readFile() {
        file = new File("src/test/resource/fileWithLines.txt");
    }

    @Test
    public void testMaxLineLength() throws  IOException {
        int len = MaxLenInList.getLongestLineLength(file);
        Assert.assertTrue("len should not be less than 100", len > 100);
    }

    @Test
    public void testMaxLineApproach1 () throws IOException{
        String longest = MaxLenInList.getLongestLineApproach1(file);
        Assert.assertTrue("longest line should be more than 100 chars", longest.length() > 100);
    }

    @Test
    public void testMaxLineApproach2 () throws IOException{
        String longest = MaxLenInList.getLongestLineApproach1(file);
        Assert.assertTrue("longest line should be more than 100 chars", longest.length() > 100);
    }
}
