package com.company;




public class Main {
    static class Animal {

        String food;
        String location;

        public Animal(String food, String location) {
            this.food = food;
            this.location = location;
        }

        public void makeNoise() {
            System.out.println("Шумит");
        }

        public void eat() {
            System.out.println("Ест");
        }

        public void sleep() {
            System.out.println("Спит");
        }
    }
    static class Dog extends Animal {
        String name;
        public Dog(String name, String food, String location) {
            super(food, location);
            this.name = name;
        }

        public void makeNoise() {
            System.out.println("Собака гавкает");
        }

        public void eat() {
            System.out.println("Собака ест мясо");
        }
    }
    static class Cat extends Animal {
        String name;
        public Cat(String name, String food, String location) {
            super(food, location);
            this.name = name;
        }
        public void makeNoise() {
            System.out.println("Кот мяукает");
        }
        public void eat() {
            System.out.println("Ест мышь");
        }
    }
    static class Horse extends Animal {
        String name;
        public Horse(String name, String food, String location) {
            super(food, location);
            this.name = name;
        }
        public void makeNoise() {
            System.out.println("Лошадь шумит");
        }
        public void eat() {
            System.out.println("Ест траву");
        }
    }
    public void main(String[] args) {
        Veterinary veterinary1 = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Дружок:", " Ест мясо", "В будке");
        animals[1] = new Cat("Тоша:", "Ест мышь", "Дома");
        animals[2] = new Horse("Сухарь:", "Ест сено", "В конюшне");

        for (Animal animal : animals) {
            veterinary1.treatAnimal(animal);
        }
    }
    static class Veterinary {
        void treatAnimal(Animal animal) {
            System.out.print(animal.food + " ");
            System.out.println(animal.location);

        }
    }
}

