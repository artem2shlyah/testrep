package testClasses;

public class TestParallelThreads extends Thread {

    @Override
    public void run() {
        ThreadMethods.GenerationArrays();
    }

    public TestParallelThreads (String name) {
        this.setName(name);
    }
}
