
// Temperature converter: convert 36.6 °C to Fahrenheit using F = C * 9 / 5 + 32. Use final for the constants where it makes sense.
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        // temperature();
        // secondConvo();
        // digitTool();
        // circleRadius();
        // leapYear();
        // bigInt();
        // triangleValidity();
        // evenOrOdd();
        // numberType();
        // largestNumber();
        // leapYearWithInput();
        // passwordChecker();
        // ElectricityBill();
        // triangleType();
        // dayOfWeek();
        VowelOrConsonant();

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

    static void evenOrOdd() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // System.out.println(number);

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }

    static void numberType() {
        // positive, negative or zero

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The entered number is Zero");
        } else if (number > 0) {
            System.out.println("The number id positive");

        } else {
            System.out.println("The number is negative");
        }
    }

    static void largestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }

    static void leapYearWithInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("The year " + year + " is a leap year ");
        } else {
            System.out.println("The year " + year + " is not a leap year ");
        }
    }

    static void passwordChecker() {
        String pass = "java123";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Password: ");
        String userpassword = sc.nextLine();

        if (userpassword.equals(pass)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Opps!, Login unsuccessful");
        }

    }

    static void ElectricityBill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brunt unit: ");
        int unit = sc.nextInt();

        int totalBill = 0;

        if (unit <= 100) {
            totalBill = unit * 5;
        } else if (unit <= 200) {
            totalBill = (100 * 5) + ((unit - 100) * 7);
        }

        if (unit > 200) {
            totalBill = (100 * 5) + (100 * 7) + ((unit - 200) * 10);
        }

        System.out.println("Your bill is " + totalBill);
    }

    static void triangleType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("Not a valid triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }

    static void dayOfWeek() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int dayNumber = sc.nextInt();

        // normal switch case
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No match found!");
                break;
        }

        switch (dayNumber) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("No match found!");
        }
    }

    static void VowelOrConsonant() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character: ");

        char chatracter = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(chatracter)) {
            System.out.println("not a valid character!");
        } else {
            switch (chatracter) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println("The Entered Character " + chatracter + " is a vowel");
                default -> System.out.println("The Entered Character " + chatracter + " is a consonant");
            }
        }

    }

}
