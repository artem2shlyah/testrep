package testClasses;

public class TestDog extends Dog {

    public void setHigh(short meters) {
        this.heigth = meters;
        System.out.println("Собака " + this.name + " перегруженной высотой " + this.heigth);
    }

    public void setMass(short foots) {
        this.mass = foots;
        System.out.println("Собака " + this.name + " перегруженной массой " + this.heigth);
    }

    @Override
    public void Move() {
        System.out.println("Собака переопределенно прыгает, бегает и кусается!");
    }

    @Override
    public void Eat() {
        System.out.println("Собака переопределенно пьет водичку и кушает!");
    }

    public TestDog(String choosenName) {
        this.name = choosenName;
    }
}
