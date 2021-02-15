package Atask;

public class Program {
    public static void main (String[]args){
        Animal[] array = new Animal [3];

        Dog dog = new Dog("Tim","bones","a dog kennel", "blue");
        Cat cat = new Cat("Tom","fish", "house","ball");
        Horse horse = new Horse ("Isabel","grass", "stable",true);
        array[0] = dog;
        array[1] = cat;
        array[2] = horse;

        Vet vet = new Vet();
        for( Animal i: array){
            vet.treatAnimal(i);
            i.makeNoise();
        }
    }
}

