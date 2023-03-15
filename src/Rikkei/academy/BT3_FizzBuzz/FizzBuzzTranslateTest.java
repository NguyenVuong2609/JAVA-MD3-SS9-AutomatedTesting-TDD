package Rikkei.academy.BT3_FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translateNumber30() {
        int num = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translateNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumber27() {
        int num = 27;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translateNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumber25() {
        int num = 25;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translateNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumber22() {
        int num = 22;
        String expected = "22";

        String result = FizzBuzzTranslate.translateNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumberPro30() {
        int num = 30;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translateNumberPro(num);
        assertEquals(expected,result);
    }
    @Test
    void translateNumberPro35() {
        int num = 35;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translateNumberPro(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumberPro50() {
        int num = 50;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translateNumberPro(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumberPro60() {
        int num = 60;
        String expected = "Sau Khong";

        String result = FizzBuzzTranslate.translateNumberPro(num);
        assertEquals(expected,result);
    }

    @Test
    void translateNumberPro26() {
        int num = 26;
        String expected = "Hai Sau";

        String result = FizzBuzzTranslate.translateNumberPro(num);
        assertEquals(expected,result);
    }
}