package by.training.hometask1.service;

public class NumberOperation {
    public int getLastDigitOfNumber(int number) {
        return number % 10;
    }

    public int getLastDigitOfNumberSquare(int number) {
        int square = getLastDigitOfNumber(number);
        if (square == 1 || square == 9) {
            return 1;
        } else if (square == 2 || square == 8) {
            return 4;
        } else if (square == 4 || square == 6) {
            return 6;
        } else if (square == 3 || square == 7) {
            return 9;
        } else if (square == 5) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean isTwoNumberEven(int num1, int num2, int num3, int num4) {
        return ((num1 & 1) + (num2 & 1) + (num3 & 1) + (num4 & 1)) <= 2;
    }

    public boolean isNumberPerfect(int number) {
        int sumDigits = 0;
        if (number == 0) {
            return false;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumDigits += i;
            }
        }
        return sumDigits == number;
    }

    /**
     * EquationOne has the form: y1 = -x^2+3x+9
     * EquationTwo has the form: y2 = 1/(x^3-6)
     */
    public double calculateEquationOne(double x) {
        return -1 * Math.pow(x, 2) + 3 * x + 9;
    }

    public double calculateEquationTwo(double x) {
        return 1 / (Math.pow(x, 3) - 6);
    }

    public double calculateResultDependingOnXValue(double x) {
        return x >= 3 ? calculateEquationOne(x) : calculateEquationTwo(x);
    }
}
