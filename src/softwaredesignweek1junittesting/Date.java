package softwaredesignweek1junittesting;

/**
 * @author tug25013
 */
public class Date {

    int year;
    int day;
    int month;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int daysTo(Date toEvaluate) {

        int yearsInDays = 0;
        int monthsInDays = 0;
        int daysInDays = 0;

        if (toEvaluate.year > this.year) {
            yearsInDays = 365 * (toEvaluate.year - this.year);
        } else {
            yearsInDays = 365 * (this.year - toEvaluate.year);
        }

        if (toEvaluate.month > this.month) {
            monthsInDays = 30 * (toEvaluate.month - this.month);
        } else {
            monthsInDays = 30 * (this.month - toEvaluate.month);
        }

        if (toEvaluate.day > this.day) {
            daysInDays = toEvaluate.day - this.day;
        } else {
            daysInDays = this.day - toEvaluate.day;
        }

        return yearsInDays + monthsInDays + daysInDays;

    }

}
