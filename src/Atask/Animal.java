package Atask;//Нужно:
//а) Создать класс Atask.Animal и расширяющие его классы Dog, Cat, Horse.
//б) В класс Atask.Animal добавить переменные food, location и методы makeNoise, eat, sleep.
//в) Метод makeNoise должен выводить на консоль "Такое-то животное спит".
//г) В классах Dog, Cat, Horse переопределить методы makeNoise, eat.
//д) Добавить переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//е) Создать класс Ветеринар, в котором определить метод void treatAnimal(Atask.Animal animal).
//ж) Этот метод должен распечатывать food и location пришедшего на прием животного.
//з) В методе main создать массив типа Atask.Animal, который содержит животных всех видов.
//и) В цикле отправить животных на прием к ветеринару.

public abstract class Animal {
        String food;
        String location;
        String name;

        public abstract void makeNoise();

        public abstract void eat();

        public void sleep() {
                System.out.println("I'm sleeping");
        }

        Animal(String name, String food, String location) {
                this.name = name;
                this.food = food;
                this.location = location;
        }
}

