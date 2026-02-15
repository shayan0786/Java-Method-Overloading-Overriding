class DataProcessor {
    //METHOD OVERLOADING
    public void processData(int number) {
        System.out.println("Processing integer data: " + number);
    }

    public void processData(String text) {
        System.out.println("Processing string data: " + text);

        int length = text.length();
        System.out.println("String length converted to integer: " + length);

        processData(length);
    }
}


//METHOD OVERRIDING
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}


public class AssignmentSolution {
    public static void main(String[] args) {

        System.out.println("----- METHOD OVERLOADING DEMONSTRATION -----");

        DataProcessor processor = new DataProcessor();

        processor.processData(10);

        System.out.println();

        processor.processData("Java");

        System.out.println("\n----- METHOD OVERRIDING DEMONSTRATION -----");

        Animal animal = new Animal();
        animal.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}


/*

EXPECTED OUTPUT:

----- METHOD OVERLOADING DEMONSTRATION -----
Processing integer data: 10

Processing string data: Java
String length converted to integer: 4
Processing integer data: 4

----- METHOD OVERRIDING DEMONSTRATION -----
Animal makes a generic sound
Dog barks

*/
