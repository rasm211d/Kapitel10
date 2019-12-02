package Opg10_1;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(505050505005L);
        Time time2 = new Time(29 ,30 , 39);
        System.out.println("Time is: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

    }


}
