package Atask;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
            System.out.println(name + " is sleeping");

    }

    @Override
    public void eat() {

    }
    String favoriteColor;
    public Dog(String name, String food, String location, String favoriteColor){
        super(name, food, location);
        this.favoriteColor = favoriteColor;
    }
}
