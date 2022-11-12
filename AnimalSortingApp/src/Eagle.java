import children.Bird;

public class Eagle extends Bird {
    
    public Eagle(){
        super(2.0, 15.0, "Bird", "Warm-blooded", false, false);
    }

    public String showInfo(){
        return
        "==================\n" +
        "Eel\n" +
        "==================\n" + 
        "height = " +getHeight() + "\n" +
        "weigth = " +getWeight() + "\n" +
        "animalType = " +getAnimalType() + "\n" +
        "bloodType = " + getBloodType() + "\n" +
        "featherless = " +isFeatherless() + "\n" +
        "flightless = " +isFlightless();
    }
}
