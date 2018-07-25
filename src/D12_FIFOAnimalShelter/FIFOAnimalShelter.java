package D12_FIFOAnimalShelter;

import java.util.Queue;

public class FIFOAnimalShelter {

    //create variables available to the whole class, but only this class, i.e. private
    private Queue<String> animalShelter;
    private Integer size = (Integer) animalShelter.size();
    private int counter = size -1;
    public String sorry = "Sorry there are no animals at this shelter right now";
    private String animal;
    private String shelter;

    //this method is for testing to make sure the assertion tests for expected and
    // actual values can compare strings and return strings in human readable form
    @Override
    public String toString(){
        return animalShelter.toString();
    }

    //scenario one - any animal if no animal type is preferred;
    public String getAnimal(){
        if(animalShelter.poll() == null){
            return sorry;
        }
        while(counter > 0){
            animal = animalShelter.poll();
            shelter = String.valueOf(animalShelter.add(animal));
            counter --;
        }
        return "Congratulations! Here is your new " + animal + ".";
    }

    //described scenario of "dequeue" to deliver the longest waiting preferred animal
    public String getPref(String pref){
        if(animalShelter.poll() == null){
            return sorry;
        }
        while(counter > 0 && animalShelter.poll() != pref) {
            String currentAnimal = animalShelter.poll();
            if (currentAnimal == pref) {
                return "Congratulations! Here is your new " + pref + ".";
            } else {
                shelter = String.valueOf(animalShelter.add(animal));
                counter--;
            }
        } return "Congratulations! Here is your new " + animal + ".";
    }

    public String getLongestStay(){
        if(animalShelter.poll() == null){
            return sorry;
        }
        return "Congratulations! Here is your new " + animalShelter.poll() + ".";
    }


}

