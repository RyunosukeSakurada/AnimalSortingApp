package parent;
/*
    Packages are used to classify and manage multiple classes.
    Units grouped according to purpose.
 */


public class Animal {
    
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    //constructor : Initialization of field variables------------------------
    public Animal() {
        this.height = 0.0;
        this.weight = 0.0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    //constructor : Substitute after initialization--------------------------
    public Animal(double height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    //getter & setter--------------------------------------------------------
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return this.animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return this.bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    /* 
        Override
        →Redefining the contents of inherited parent class methods in child classes
    */
    @Override
    public String toString() {
        return "{" +
            " height='" + getHeight() + "'" +
            ", weight='" + getWeight() + "'" +
            ", animalType='" + getAnimalType() + "'" +
            ", bloodType='" + getBloodType() + "'" +
            "}";
    }

}
