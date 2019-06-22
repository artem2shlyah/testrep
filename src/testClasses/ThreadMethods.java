package testClasses;


import java.util.Arrays;

public class ThreadMethods {

    public static void GenerationArrays() {
        int[] array = new int[5];
        for (short i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.println("Поток " + Thread.currentThread().getName() + " сгенерировал число " + array[i] + "...");
        }
    }

    public synchronized static void SynchMethod() {
        short[] array = new short[15];
        for (short i = 0; i < array.length; i++) {
            array[i] = (short) (Math.random() * 21);
        }
        String str = Arrays.toString(array);
        System.out.println("Синхронизированный метод в потоке " + Thread.currentThread().getName() + " сгенерировал массив " + str);
    }
}
