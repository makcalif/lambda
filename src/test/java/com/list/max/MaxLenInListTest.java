package com.list.max;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;

public class MaxLenInListTest {

    @Test
    public void testMaxInFile() throws URISyntaxException, FileNotFoundException, IOException {
        File file = new File("src/test/resource/fileWithLines.txt");
        int len = MaxLenInList.getLongestLine(file);
        Assert.assertTrue("len should not be less than 100", len > 100);
    }
}
