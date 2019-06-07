import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskWithTypes {

    Scanner userChoice = new Scanner(System.in);

    public static void main (String[] args) {
        TaskWithTypes tasks = new TaskWithTypes();
        tasks.start();
    }

    private void start() {
        System.out.println("Выберите задание:");
        System.out.println("1: Среднее арифметическое массива");
        System.out.println("2: Вычисление факториала");
        System.out.println("3: Узнать цену товара");
        System.out.println("4: Узнать четность числа");
        System.out.println("5: Преобразование массива в строку и обратно");
        System.out.println("6: Добавление слова к каждому элементу массива");
        System.out.println("7: Преобразование массива в boolean");


        byte task = userChoice.nextByte();

        switch (task) {
            case 1:
                AverageOfArray();
                break;
            case 2:
                Fact();
                break;
            case 3:
                ProductPrice();
                break;
            case 4:
                Parity();
                break;
            case 5:
                StringConversion();
                break;
            case 6:
                WordAdd();
                break;
            case 7:
                BooleanConversion();
                break;
            default:
                break;
        }
    }


    private void AverageOfArray() {
        ArrayList<Short> array = new ArrayList<>();
        short arrayVar;
        double avg = 0;
        System.out.println("Введите длину массива");

        short length = userChoice.nextShort();

        for (Short i = 0; i <= length; i++) {
            arrayVar = (short) (Math.random() * 11);
            array.add(arrayVar);
            avg += arrayVar;
        }

        avg = avg / length;


        System.out.print("Массив: ");
        for (Short i = 0; i<= length; i++) {System.out.print(array.get(i) + " ");}
        System.out.println();

        System.out.print("Среднее арифметическое равно " + avg);
    }

    private void Fact() {
        int res = 1;

        System.out.println("Введите аргумент факториала (неотрицательное целое число в разумных пределах, например до 12)");
        Short arg = userChoice.nextShort();

        if (arg >= 0) {
            if (arg == 0) {
                System.out.println("Значение факториала равно " + res);
            }
            if (arg <= 12 && arg > 0) {
                while (arg > 0) {
                    res = res * arg;
                    arg--;
                }
                System.out.println("Значение факториала равно " + res);
            }
            if (arg > 12) {
                System.out.println("Значение факториала выйдет за рамки здарвого смысла, аргумент больше 12");
            }
        }
        else {
            System.out.println("Некорректный аргумент");
        }
    }

    private void ProductPrice() {}

    private void Parity() {}

    private void StringConversion() {}

    private void WordAdd() {}

    private void BooleanConversion() {}
}
