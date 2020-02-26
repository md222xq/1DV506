package md222xq_assign3;

import java.util.Date;

public class DateFormat {

    private int year;
    private int month;
    private int day;
    private String punctuation;
    private char format;

    public DateFormat(int year, int month, int day, String punctuation, char format) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setPunctuation(punctuation);
        setFormat(format);
    }

    public DateFormat() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int theYear) {
        this.year = theYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int theMonth) {
        this.month = theMonth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int theDay) {
        this.day = theDay;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(String thePunctuation) {
        this.punctuation = thePunctuation;
    }

    public char getFormat() {
        return format;
    }

    public void setFormat(char theFormat) {
        this.format = theFormat;
    }


    public String getDate(boolean fullYear) {

        if (day > 31){
            return "Invalid date.";
        }

        if (punctuation == "!"){
            punctuation = "";
        }




        if (fullYear == true) {
            if (format == 'b') {
                if (this.month < 10 && day < 10) {
                    return "" + year + punctuation + "0" + month + punctuation + "0" + day;
                } else if (month < 10) {
                    return "" + year + punctuation + "0" + month + punctuation + day;
                } else if (day < 10) {
                    return "" + year + punctuation + month + punctuation + "0" + day;
                } else {
                    return "" + year + punctuation + month + punctuation + day;
                }
            }

            if (format == 'l') {
                if (month < 10 && day < 10) {
                    return "0" + day + punctuation + "0" + month + punctuation + year;
                } else if (month < 10) {
                    return "" + day + punctuation + "0" + month + punctuation + year;
                } else if (day < 10) {
                    return "0" + day + punctuation + month + punctuation + year;
                } else {
                    return "" + day + punctuation + month + punctuation + year;
                }
            }
            if (format == 'm') {
                if (this.month < 10 && day < 10) {
                    return "0" + month + punctuation + "0" + day + punctuation + year;
                } else if (month < 10) {
                    return "0" + month + punctuation + day + punctuation + year;
                } else if (day < 10) {
                    return "" + month + punctuation + "0" + day + punctuation + year;
                } else {
                    return "" + month + punctuation + day + punctuation + year;
                }
            }

        }


        else if (fullYear != true){

            if (year > 2000) {
                year = year - 2000;

            }
            else if (year < 2000) {
                year = year - 1900;
            }




            if (format == 'b') {
                if (this.month < 10 && day < 10) {
                    return "" + year + punctuation + "0" + month + punctuation + "0" + day;
                } else if (month < 10) {
                    return "" + year + punctuation + "0" + month + punctuation + day;
                } else if (day < 10) {
                    return "" + year + punctuation + month + punctuation + "0" + day;
                } else {
                    return "" + year + punctuation + month + punctuation + day;
                }
            }

            if (format == 'l') {
                if (month < 10 && day < 10) {
                    return "0" + day + punctuation + "0" + month + punctuation + year;
                } else if (month < 10) {
                    return "" + day + punctuation + "0" + month + punctuation + year;
                } else if (day < 10) {
                    return "0" + day + punctuation + month + punctuation + year;
                } else {
                    return "" + day + punctuation + month + punctuation + year;
                }
            }
            if (format == 'm') {
                if (this.month < 10 && day < 10) {
                    return "0" + month + punctuation + "0" + day + punctuation + year;
                } else if (month < 10) {
                    return "0" + month + punctuation + day + punctuation + year;
                } else if (day < 10) {
                    return "" + month + punctuation + "0" + day + punctuation + year;
                } else {
                    return "" + month + punctuation + day + punctuation + year;
                }
            }
        }
        return null;
    }
}