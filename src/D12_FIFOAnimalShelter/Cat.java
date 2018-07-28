package D12_FIFOAnimalShelter;

public class Cat extends Pet {
    public Cat(String name){
        super(name);
        this.type = "cat";
    }
    public String sound() {
        return "meow";
    }

}
