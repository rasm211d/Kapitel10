package Opg10_1;

import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long totalMilli = System.currentTimeMillis();
        long totalSeconds = totalMilli / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24 + 1;

        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }

    public Time(long elapsed) {
        setTime(elapsed);

    }

    public Time(int hour, int minute, int second) {

        if (hour > 24) {
            hour %= 24;
            this.hour = hour;
        } else {
            this.hour = hour;
        }

        if (hour > 60) {
            minute %= 60;
            this.minute = minute;
        } else {
            this.minute = minute;
        }

        this.second = second;

    }

    public void setTime(long elapsedTime) {
        long totalMilli = elapsedTime;
        long totalSeconds = totalMilli / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24 + 1;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
