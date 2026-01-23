package Execicio.Heranca_e_Poslimorfismo.Clock;

public sealed abstract class Clock permits BRLClock, USCloack {
    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (this.hour >= 24){
            throw new IllegalArgumentException("Hour must be in range 0..23");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (this.minute >= 60) {
            throw new IllegalArgumentException("Minute must be in range 0..59");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (this.second >= 60) {
            throw new IllegalArgumentException("Second must be in range 0..59");
        }
            this.second = second;
    }

    abstract Clock convert(Clock clock);
}
