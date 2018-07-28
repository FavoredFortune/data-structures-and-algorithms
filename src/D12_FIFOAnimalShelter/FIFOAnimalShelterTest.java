package D12_FIFOAnimalShelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class FIFOAnimalShelterTest {

    @Test
    void toStringEmptyTest() {
        Queue<String> empty = new LinkedList<String>();
        String emptyString = empty.toString();

        assertEquals(emptyString, empty.toString());
    }

    @Test
    void toStringFullQueueTest() {
        Queue<String> full = new LinkedList<String>();
        full.add("hie");
        full.add("bie");
        full.add("jie");
        full.add("bie");

        String fullString = "[hie, bie, jie, bie]";

        assertEquals(fullString, full.toString());
    }

    @Test
    void toStringIntegerQueueTest() {
        Queue<Integer> numberTest = new LinkedList<Integer>();
        numberTest.add(7);
        numberTest.add(43);
        numberTest.add(12);

        String expected = numberTest.toString();
        String actual = "[7, 43, 12]";

        assertEquals(expected, actual);
    }

    @Test
    void getAnimalEmptyShelterTest() {
        FIFOAnimalShelter animalShelter = new FIFOAnimalShelter();
        Pet expected = animalShelter.getAnimal();
        Pet actual = null;

        assertEquals(expected, actual);
    }

    @Test
    void addAnimalAddOneTest() {
        Queue<Pet> onePetAnimalShelter = new LinkedList<>();
        onePetAnimalShelter.offer(cat);

    }

    @Test
    void getAnimalHasOneAnimalTest() {
        FIFOAnimalShelter animalShelter = new FIFOAnimalShelter();
        ;
        LinkedList<Pet> full = new LinkedList<>();

        assertEquals(expected, actual);
    }


    @Test
    void getPref() {
    }

}

