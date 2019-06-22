package testClasses;

public class TestSynchThread extends Thread {

    @Override
    public void run() {
        ThreadMethods.SynchMethod();
    }

    public TestSynchThread(String name) {
        this.setName(name);
    }
}
