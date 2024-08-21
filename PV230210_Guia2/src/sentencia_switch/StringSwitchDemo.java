package sentencia_switch;

public class StringSwitchDemo {

    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "JANUARY":
                monthNumber = 1;
                break;

            case "FEBRUARY":
                monthNumber = 2;
                break;

            case "MARCH":
                monthNumber = 3;
                break;

            case "APRIL":
                monthNumber = 4;
                break;

            case "MAY":
                monthNumber = 5;
                break;

            case "JUNE":
                monthNumber = 6;
                break;

            case "JULY":
                monthNumber = 7;
                break;

            case "AUGUST":
                monthNumber = 8;
                break;

            case "SEPTEMBER":
                monthNumber = 9;
                break;

            case "OCTOBER":
                monthNumber = 10;
                break;

            case "NOVEMBER":
                monthNumber = 11;
                break;

            case "DECEMBER":
                monthNumber = 12;
                break;

            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "FEBRUARY";

        int returnedMonthNumber = StringSwitchDemo.getMonthNumber(month);
        if (returnedMonthNumber == 0) {
            System.out.println("INVALID MONTH");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
}
