package Atask;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println(name + " is sleeping");

    }

    @Override
    public void eat() {

    }
    String favouriteToy;

    public Cat(String name,String food, String location, String favouriteToy) {
        super(name,food, location);
        this.favouriteToy = favouriteToy;
    }
}
