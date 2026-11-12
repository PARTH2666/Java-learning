// Temperature converter: convert 36.6 °C to Fahrenheit using F = C * 9 / 5 + 32. Use final for the constants where it makes sense.

public class p1 {

    public static void main(String[] args) {
        temperature();
        secondConvo();
        digitTool();
        circleRadius();
        leapYear();
        bigInt();
        triangleValidity();
    }

    static void temperature() {
        double temperature = 36.6;

        System.out.println("Fahrenheit:" + ((double) (temperature * 9 / 5 + 32)));
    }

    static void secondConvo() {
        final int TOTAL_SECOND = 10000;
        int hours = TOTAL_SECOND / 3600;
        int seconds = TOTAL_SECOND % 60;
        int minutes = (TOTAL_SECOND % 3600) / 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }

    static void digitTool() {
        final int number = 7391;

        int lastDigit = number % 10;
        int firstDigit = number / 1000;

        // total
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number % 100) / 10;
        int total = firstDigit + secondDigit + thirdDigit + lastDigit;
        System.out.println("Last digit: " + lastDigit);
        System.out.println("First digit: " + firstDigit);
        System.out.println("total:  " + total);
    }

    static void circleRadius() {
        final double radius = 7.5;
        final double pi = 3.14;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("area: " + area + "\ncircumference: " + circumference);
    }

    static void leapYear() {
        final int year = 2026;
        boolean condition1 = year % 4 == 0;
        boolean condition2 = year % 100 != 0;

        boolean condition3 = year % 400 == 0;
        System.out.println(condition1 + "" + condition2 + "" + condition3);
        System.out.println(((condition1 && condition2) || condition3));
    }

    static void bigInt() {
        int a = 14, b = 29, c = 21;

        int bigNumber = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(bigNumber);

    }

    static void triangleValidity() {
        int a = 2, b = 3, c = 5;

        boolean validity = a + b > c && a + c > b && b + c > a;
        System.out.println(validity);
    }
}
