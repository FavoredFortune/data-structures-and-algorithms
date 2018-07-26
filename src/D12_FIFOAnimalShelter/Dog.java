package D12_FIFOAnimalShelter;

public class Dog extends Pet{
    public Dog(String name){
        super(name);
        this.type = "dog";
    }

    @Override
    public String sound() {
        return "bark";
    }
}
