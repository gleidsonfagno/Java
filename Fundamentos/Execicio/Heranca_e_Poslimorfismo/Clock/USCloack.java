package Execicio.Heranca_e_Poslimorfismo.Clock;

public non-sealed class USCloack extends Clock {

    private String periodIndicator = "AM";

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        this.periodIndicator = "AM";
        if ((hour > 12) && (hour <=23)){
            this.periodIndicator = "PM";
            this.hour = hour - 12;
        } else if (hour >=24){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        return null;
    }
}
