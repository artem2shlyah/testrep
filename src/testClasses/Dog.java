package testClasses;

import interfaces.Animals;

public class Dog implements Animals {
    int heigth, mass;
    String name;

    @Override
    public void setHigh(int high) {
        this.heigth = high;
        System.out.println("Собака " + this.name + " стандартной высотой " + this.heigth);
    }


    @Override
    public void setMass(int massa) {
        this.mass = massa;
        System.out.println("Собака " + this.name + " стандартной массой " + this.mass);
    }

    @Override
    public void Move() {
        System.out.println("Собака бегает, прыгает и кусает!");
    }

    @Override
    public void Eat() {
        System.out.println("Собака кушает!");
    }

    @Override
    public void SuperMoove() {
        System.out.println("Не переопределенной метод класса-родителя!");
    }

    public Dog (String name) {
        this.name = name;
    }

    public Dog() {}
}
