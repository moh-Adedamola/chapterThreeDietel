package chapterThree.car.clock;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(12, 30, 45);
        clock.displayTime();

        clock.setHour(25);
        clock.displayTime();

        clock.setMinute(61);
        clock.displayTime();

        clock.setSecond(61);
        clock.displayTime();

        clock.setHour(10);
        clock.setMinute(45);
        clock.setSecond(30);
        clock.displayTime();
    }

}
