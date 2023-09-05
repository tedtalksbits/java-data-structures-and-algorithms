package test;
import dataStructures.TwoDimensionalArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDimensionalTests {
    @Test
    public void printRowTest() throws Exception {
        TwoDimensionalArray<Integer> twoDimensionalArray = new TwoDimensionalArray<>();
        Integer[][] table = {{1,2,3}, {4,5,6}};
        twoDimensionalArray.setTwoDimensionalArr(table);
        assertEquals(table, twoDimensionalArray.getTwoDimensionalArr());
        assertEquals("456", twoDimensionalArray.getRowAtIndex(1));
        assertEquals("123456", twoDimensionalArray.getAllValues());
    }

    public void outOfBoundsErrorTest() throws Exception {
    // check to make sure that the appropriate error is thrown

    }


}
