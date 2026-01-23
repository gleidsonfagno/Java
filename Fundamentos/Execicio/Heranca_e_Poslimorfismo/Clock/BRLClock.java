package Execicio.Heranca_e_Poslimorfismo.Clock;

public non-sealed class BRLClock extends Clock{



    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case USCloack usClock ->{
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
            }
            case BRLClock brClock ->{
                this.hour = brClock.getHour();
            }
        }
        return null;
    }
}
