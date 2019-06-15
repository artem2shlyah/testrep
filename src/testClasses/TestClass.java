package testClasses;

public class TestClass {
    private int instance = 0;
    private String name;

    public void setInstance(int inst) {
        this.instance = inst;
        System.out.println("Объекту " + this.name + " передан и присвоен параметр " + this.instance);
    }

    public TestClass (String entranceName) {
        this.name = entranceName;
    }

    public String getName() {
        return this.name;
    }

}
