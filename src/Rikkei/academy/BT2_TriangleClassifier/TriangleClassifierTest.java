package Rikkei.academy.BT2_TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testIsNotATriangle() {
        int first = 8;
        int second = 2;
        int third = 3;
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.testTriangle(first,second,third);
        assertEquals(expected,result);
    }

    @Test
    void testIsAIsoscelesTriangle() {
        int first = 2;
        int second = 2;
        int third = 3;
        String expected = "Tam giác cân";

        String result = TriangleClassifier.testTriangle(first,second,third);
        assertEquals(expected,result);
    }

    @Test
    void testIsAEquilateralTriangle() {
        int first = 2;
        int second = 2;
        int third = 2;
        String expected = "Tam giác đều";

        String result = TriangleClassifier.testTriangle(first,second,third);
        assertEquals(expected,result);
    }

    @Test
    void testIsATriangle() {
        int first = 3;
        int second = 4;
        int third = 5;
        String expected = "Tam giác thường";

        String result = TriangleClassifier.testTriangle(first,second,third);
        assertEquals(expected,result);
    }
}