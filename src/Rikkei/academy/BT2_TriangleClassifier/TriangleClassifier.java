package Rikkei.academy.BT2_TriangleClassifier;

public class TriangleClassifier {
    public static String testTriangle(int firstSide, int secondSide, int thirdSide) {
        String result = "";
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            if (firstSide == secondSide && secondSide == thirdSide) {
                result = "Tam giác đều";
            } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
                result = "Tam giác cân";
            } else
                result = "Tam giác thường";
        } else {
            result = "Không phải là tam giác";
        }
        return result;
    }
}
