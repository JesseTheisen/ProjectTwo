/*
 * SNHU IT-145
 * 5-4 Milestone: Menu loop and monkey intake
 * Driver.java
 * Professor Mahendra Gossai
 *
 */

import java.lang.String;

public class Monkey extends RescueAnimal {

    // instance variable
    private String species;
    private String bodyLength;
    private String tailLength;
    private String height;
    private String setSpecies;
    private String setHeight;
    private String setBodyLength;
    private String setTailLength;
    
    // constructor with detailed parameters
    public Monkey(String species, String height, String bodyLength, String tailLength) {
        setSpecies(species);
        setHeight(height);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
    }
    // monkey getters
    public String getSpecies() {
        return species;
    }
    public String getBodyLength() {
        return bodyLength;
    }
    public String getTailLength() {
        return tailLength;
    }
    public String getHeight() {
        return height;
    }
    // monkey setters
    public void setSpecies(String species) {
        this.setSpecies = species;
    }
    public void setHeight(String height) {
        this.setHeight = height;
    }
    public void setBodyLength(String bodyLength) {
        this.setBodyLength = bodyLength;
    }
    public void setTailLength(String lengthLength) {
        this.setTailLength = tailLength;
    }
  }
