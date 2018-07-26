package D12_FIFOAnimalShelter;

public class Pet {
    public String name;
    public String type;

    public Pet(String name) {
        this.name = name;
    }

    public String sound() {
        return "";
    }

    public String toString() {
        return this.name + " " + this.sound();
    }


}
