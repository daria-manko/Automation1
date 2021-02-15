package Atask;

public class Horse extends Animal{

    @Override
    public void makeNoise() {
        System.out.println(name + " is sleeping");

    }

    @Override
    public void eat() {

    }
    boolean wearBraids = true;

    public Horse(String name, String food, String location, boolean wearBraids) {
        super(name, food, location);
        this.wearBraids = wearBraids;
    }
}
