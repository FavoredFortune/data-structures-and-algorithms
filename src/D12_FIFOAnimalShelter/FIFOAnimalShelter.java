//package D12_FIFOAnimalShelter;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class FIFOAnimalShelter {
//
//    //create variables available to the whole class, but only this class, i.e. private
//    private Queue<Pet> animalShelter = new LinkedList<>();
//    private int size = animalShelter.size();
//    private int counter = size -1;
//    private Pet animal = new Pet();
//    private Pet cat = new Cat(cat);
//    private Pet dog = new Dog(dog);
//
//    //this method is for testing to make sure the assertion tests for expected and
//    // actual values can compare strings and return strings in human readable form
//    @Override
//    public String toString(){
//        return animalShelter.toString();
//    }
//
//    //scenario one - any animal if no animal type is preferred;
//    public Pet getAnimal(){
//        if(animalShelter.poll() == null){
//            return null;
//        }
//        System.out.println("Congratulations! Here is your new " + animalShelter.poll() + ".");
//        return animalShelter.poll();
//    }
//
//    public void addAnimal(Pet pet){
//        animalShelter.offer(pet);
//        System.out.println("You just added a "+ pet.type+ " to the animal shelter.");
//
//    }
//
//    //described scenario of "dequeue" to deliver the longest waiting preferred animal
//    public Pet getPref(String pref){
//        if(animalShelter.poll() == null){
//            System.out.println(sorry);
//            return null;
//        }
//        while(counter > 0 && animalShelter.poll().type != pref) {
//            Pet currentAnimal = animalShelter.poll();
//            if (currentAnimal.type == pref) {
//                System.out.println("Congratulations! Here is your new " + pref + ".");
//                return currentAnimal;
//            } else {
//                currentAnimal = animalShelter.poll();
//                animalShelter.add(currentAnimal);
//                counter--;
//            }
//        }
//        System.out.println("Congratulations! Here is your new " + pref + ".");
//        return animal;
//    }
//
//
//
//
//}
//
