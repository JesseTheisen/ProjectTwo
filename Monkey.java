/*
 * SNHU IT-145
 * 5-4 Milestone: Menu loop and monkey intake
 * Driver.java
 * Professor Mahendra Gossai
 *
 */

public class Monkey extends RescueAnimal {
    
    // instance variable
    private String species;
    private String name;
    private String gender;
    private String age;
    private String weight;
    private String height;
    private String acquisitionDate;
    private String acquisitionLocation;
    private boolean reserved;
    private String inServiceLocation;
    private String trainingStatus;
    
    // constructor with detailed parameters
    public Monkey(String name, String species, String gender, String age, 
                  String weight, String height, String acquisitionDate,
                  String acquisitionCountry, String trainingStatus, 
                  boolean reserved, String inServiceLocation) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceLocation);
    }
    // getter methods for monkeys
    public String getSpecies() {
        return species;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getAge() {
        return age;
    }
    public String getHeight() {
        return height;
    }
    public String getWeight() {
        return weight;
    }
    public String getAcquisitionDate() {
        return acquisitionDate;
    }
    public String getAcquisitionLocation() {
        return acquisitionLocation;
    }
    public String getTrainingStatus() {
        return trainingStatus;
    }
    public boolean getReserved() {
        return reserved;
    }
    public String getInServiceLocation() {
        return inServiceLocation;
    }
    // setter methods for monkeys
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }
    public void setAcquisitionLocation() {
        this.acquisitionLocation = acquisitionLocation;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    public void setInServiceLocation(String inServiceLocation) {
        this.inServiceLocation = inServiceLocation;
    }
    public void setTrainingStatus() {
        this.trainingStatus = trainingStatus;
    }
}
