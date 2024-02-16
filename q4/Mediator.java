public class Mediator implements IMediator {
    Alarm alarm;
    Sprinkler sprinkler;
    CoffeePot coffeePot;

    public void setAlarm(Alarm alarm){
        this.alarm = alarm;
    }

    public Alarm getAlarm(){
        return alarm;
    }

    public void setSprinkler(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    public Sprinkler getSprinkler(){
        return sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot){
        this.coffeePot = coffeePot;
    }

    public CoffeePot getCoffeePot(){
        return coffeePot;
    }

    @Override
    public void doAlarm(){
        sprinkler.doSprinkler(this);
        coffeePot.doCoffeePot(this);
    }
    
    @Override
    public void doSprinkler(){
        alarm.endAlarm("Sprinkler");
    }

    @Override
    public void doCoffeePot(){
        alarm.endAlarm("CoffeePot");
    }
}
