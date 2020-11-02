package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest {

    @ParameterizedTest
    @CsvSource({
            "2  , 3  , 4  , valid         ",
            "2.5, 3.5, 5.5, valid         ",
            "2  , 2  , 5  , invalid       ",
            "4  , 4  , 5  , isosceles     ",
            "2  , 2  , 2  , equaliteral   ",
            "1  , 1  , 1  , equaliteral   ",
            "99 , 99 , 99 , equaliteral   ",
            "1  , 2  , 3  , invalid       ",
            "1  , 3  , 2  , invalid       ",
            "3  , 2  , 1  , invalid       ",
            "2  , 5  , 10 , invalid       ",
            "2  , 2  , 4  , invalid       ",
            "0  , 1  , 2  , zero value    ",
            "1  , 0  , 2  , zero value    ",
            "1  , 2  , 0  , zero value    ",
            "0  , 0  , 0  , zero value    ",
            "15 , 20 , -1 , negative value",
            "15 , 20 ,    , no args       ",
            "15 ,    ,    , no args       "
    })
    void testSample(Float a, Float b, Float c, String expected) {
        if ((c == null ) & (b == null)) {
            Assertions.assertEquals(new Logic(a).getResult(), expected);
        } else if (c == null ) {
            Assertions.assertEquals(new Logic(a, b).getResult(), expected);
        } else {
            Assertions.assertEquals(new Logic(a, b, c).getResult(), expected);
        }
    }


}
