public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();
        Mediator mediator = new Mediator();
        mediator.setAlarm(alarm);
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);
        alarm.setMediator(mediator);

        alarm.doAlarm();
    }    
}
