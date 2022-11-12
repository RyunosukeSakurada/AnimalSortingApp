package children;

import parent.Animal;

public class Bird extends Animal{
    
    private boolean featherless;
    private boolean flightless;

    public Bird(){
        super();
        this.featherless = true;
        this.flightless = true;
    }

    public Bird(double height, double weight, String animalType, String bloodType, boolean featherless,
            boolean flightless) {
        super(height, weight, animalType, bloodType);
        this.featherless = featherless;
        this.flightless = flightless;
    }

    public boolean isFeatherless() {
        return featherless;
    }

    public boolean isFlightless() {
        return flightless;
    }

    
    
}
