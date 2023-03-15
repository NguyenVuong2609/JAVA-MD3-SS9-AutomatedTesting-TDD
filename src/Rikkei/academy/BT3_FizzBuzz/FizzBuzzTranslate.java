package Rikkei.academy.BT3_FizzBuzz;

public class FizzBuzzTranslate {
    public static String translateNumber(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isBuzz && isFizz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return number + "";
    }

    public static String translateNumberPro(int number) {
        String[] numberToString = {"Khong", "Mot", "Hai", "Fizz", "Bon", "Buzz", "Sau", "Bay", "Tam", "Chin"};
        boolean isFizzDozen = number / 10 == 3;
        boolean isFizzUnit = number % 10 == 3;
        boolean isBuzzDozen = number / 10 == 5;
        boolean isBuzzUnit = number % 10 == 5;
        if (isFizzDozen && isBuzzUnit || isBuzzDozen && isFizzUnit)
            return numberToString[3] + numberToString[5];
        if (isFizzDozen || isFizzUnit)
            return numberToString[3];
        if (isBuzzDozen || isBuzzUnit)
            return numberToString[5];
        return numberToString[number / 10] + " " + numberToString[number % 10];
    }
}
