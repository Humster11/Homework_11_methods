public class Task1 {

    public static void printLeapYear(int year) {
        System.out.println(year + " год является високосным");
    }

    public static void printNotLeapYear(int year) {
        System.out.println(year + " год не является високосным");
    }

    public static void checkLeapYear(int year) {
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0) {
                printLeapYear(year);
            } else if (year % 400 == 0) {
                printLeapYear(year);
            } else {
                printNotLeapYear(year);
            }
        } else {
            printNotLeapYear(year);
        }
    }

    public static void main(String[] args) {
        int year = 1900;
        checkLeapYear(year);
    }
}