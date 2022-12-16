public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(1);
        printThreeWords();
        System.out.println();
        checkSumSign(1, 1);
        System.out.println();
        printColor(0);
        System.out.println();
        compareNumbers(0, 1);
        System.out.println();
        System.out.println(checkingTheAmountOfNumbers(5, 5));
        System.out.println();
        negativePositiveNumber(0);
        System.out.println();
        System.out.println(negativePositiveNumberTrueFalse(0));
        System.out.println();
        copyingString("Привет", 2);
        System.out.println();
        System.out.println(leapYearOrNot(2001));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && (value <= 100)) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkingTheAmountOfNumbers(int a, int b) {
        boolean checking;
        int c = a + b;
        if (c >= 10 && (c <= 20)) {
            checking = true;
        } else {
            checking = false;
        }
        return (checking);
    }

    public static void negativePositiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Позетивное число");
        } else {
            System.out.println("Неготивное число");
        }
    }

    public static boolean negativePositiveNumberTrueFalse(int a) {
        boolean number;
        if (a >= 0) {
            number = true;
        } else {
            number = false;
        }
        return number;
    }

    public static void copyingString(String a, int b) {
        for (int j = 1; j <= b; j++) {
            System.out.println(a);
        }

    }

    public static boolean leapYearOrNot(int year) {
        boolean years;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            years = true;
        } else {
            years = false;
        }
        return years;
    }
}
