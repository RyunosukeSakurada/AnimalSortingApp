package children;

import parent.Animal;

public class Reptile extends Animal{

    private String skinType;
    private String skeletalStructure;
    private String eggType;


    //constructor : Initialization of field variables------------------------
    public Reptile() {
        super();
        /*
        super()
        →super is used when an instance of a child class (i.e., an entity of the class created by new [class name()]) needs to access a member of a parent class instance to reference a value.
         */
        this.skinType = "Dry Skin";
        this.skeletalStructure = "Vertebrae";
        this.eggType = "Soft-shelled Eggs";
    }


    //constructor : Substitute after initialization--------------------------
    public Reptile(double height, double weight, String animalType, String bloodType,String skinType,String skeletalStructure, String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.skeletalStructure = skeletalStructure;
        this.eggType = eggType;
    }



    //getter------------------------------------------------------------
    public String getSkinType() {
        return skinType;
    }
    public String getSkeletalStructure() {
        return skeletalStructure;
    }
    public String getEggType() {
        return eggType;
    }
    
    
}
