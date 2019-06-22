import testClasses.*;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("8: Решение, что делать днем");
        System.out.println("9: Цикл с пред- и послеусловием");
        System.out.println("10: Вызов другого класса");
        System.out.println("11: Перегрузка и переопределение");
        System.out.println("12: Работа с коллекциями");
        System.out.println("13: Работа с исключениями");
        System.out.println("14: Работа с потоками");
        System.out.println("Для выхода введите любое число кроме доступных");

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
            case 8:
                TimeMoney();
                break;
            case 9:
                BeforeAfterCycle();
                break;
            case 10:
                AnotherClass();
                break;
            case 11:
                startDogs();
                break;
            case 12:
                startCollection();
                break;
            case 13:
                startTryCatch();
                break;
            case 14:
                ThreadMagic();
                break;
            default:
                break;
        }
    }


    private void AverageOfArray() {
        ArrayList<Short> array = new ArrayList();
        short arrayVar;
        double avg = 0;
        System.out.print("Введите длину массива: ");
        short length = userChoice.nextShort();
        System.out.println();

        for (Short i = 0; i <= length - 1; i++) {
            arrayVar = (short) (Math.random() * 11);
            array.add(arrayVar);
            avg += arrayVar;
        }

        avg = avg / length;


        System.out.print("Массив: ");
        for (Short i:array) {System.out.print(i + " ");}
        System.out.println();

        System.out.println("Среднее арифметическое равно " + avg);
        start();
    }

    private void Fact() {
        int res = 1;

        System.out.print("Введите аргумент факториала (неотрицательное целое число в разумных пределах, например до 12): ");
        Short arg = userChoice.nextShort();
        System.out.println();

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
        start();
    }

    private void ProductPrice() {
        short j;
        System.out.print("Введите количество товаров: ");
        short length = userChoice.nextShort();
        System.out.println();

        int[][] ProductPrices = new int[length][2];

        for (short i = 0; i <= length - 1; i++) {
            for (j = 0; j <= 1; j++) {
                ProductPrices[i][j] = (int) (Math.random() * 100001);
            }
        }
        System.out.println("Коды товаров:");
        for (short i = 0; i <= length - 1; i++) {System.out.println(ProductPrices[i][0]);}
        j = 0;

        while (j == 0) {
            System.out.print("Введите код товара, чтобы узнать его цену: ");
            int ProductCode = userChoice.nextInt();

            for (short i = 0; i <= length - 1; i++) {
                if (ProductPrices[i][0] == ProductCode) {
                    System.out.println("Цена выбранного товара составляет " + ProductPrices[i][1]);
                    j++;
                }
                if (i == length - 1 && j == 0) {
                    System.out.println("Введен некорректный код продукта! Попробуйте еще раз");
                }
            }
        }
        start();
    }

    private void Parity() {
        System.out.print("Введите число: ");
        int n = userChoice.nextInt();
        System.out.println();

        if (n % 2 == 0) {System.out.println("Введенное число - четное!");}
        else {System.out.println("Введенное число - нечетное!");}
        start();
    }

    private void StringConversion() {
        System.out.print("Введите длину массива: ");
        short length = userChoice.nextShort();
        System.out.println();

        int[] array = new int[length];

        for (short i = 0; i <= length - 1; i++) {
            array[i] = ((short) (Math.random() * 21));
        }

        String StringArray = Arrays.toString(array);
        System.out.println("Строка, содержащая все эелементы массива: " + StringArray);

        StringArray = StringArray.replace("[","");
        StringArray = StringArray.replace("]","");
        StringArray = StringArray.replace(",","");
        String[] StrVar = StringArray.split(" ");
        for (short i = 0; i < StrVar.length; i++) {
            array[i] = Integer.parseInt(StrVar[i]);
        }

        System.out.print("Числовой массив после преобразования из строки: ");
        for (int i : array) {System.out.print(i + " ");}
        System.out.println();

        start();
    }

    private void WordAdd() {
        System.out.print("Введите длину массива: ");
        short length = userChoice.nextShort();
        System.out.println();
        short var;

        String[] array = new String[length];

        for (short i = 0; i <= length - 1; i++) {
            var = (short) (Math.random() * 21);
            array[i] = Integer.toString(var);
        }
        System.out.print("Начальный массив: ");
        for (String i: array) {System.out.print(i + " ");}
        System.out.println();

        for (short i = 0; i<= length - 1; i++) {
            array[i] += " hello";
        }
        System.out.println("Массив после преобразования: ");
        for (String i: array) {System.out.println(i);}

        start();
    }

    private void BooleanConversion() {
        System.out.print("Введите количество элементов массива: ");
        short length = userChoice.nextShort();
        System.out.println();

        short[] array = new short[length];

        for (short i = 0; i < length; i++) {
            array[i] = (short) (Math.random() * 21);
        }

        System.out.print("Исходный массив: ");
        for (short i : array) {System.out.print(i + " ");}
        System.out.println();

        short exp = 0;
        boolean[] boolArray = new boolean[length];
        for (short i : array) {
            boolArray[exp] = ( i % 2 == 0);
            exp++;
        }

        System.out.print("Булевый массив по четности: ");
        for (boolean i : boolArray) {System.out.print(i + " ");}
        System.out.println();

        start();
    }

    private void TimeMoney() {
        Scanner tryIt = new Scanner(System.in);
        System.out.print("Введите время и сумму денег в формате \"ЧЧ:ММ ХХХ\": ");
        String enter = tryIt.nextLine();

        enter = enter.replace(":", " ");
        String[] enterArray = enter.split(" ");
        int hours = Integer.parseInt(enterArray[0]);
        int minutes = Integer.parseInt(enterArray[1]);
        int money = Integer.parseInt(enterArray[2]);

        if ((hours > 23 || hours <0) || (minutes < 0 || minutes > 59) || (money < 0)) {
            System.out.println("Вы ввели некорректное время или сумму денег. Пожалуйста, попробуйте еще раз!");
            TimeMoney();
        }
        else {
            if (hours < 8 || hours >= 22) {
                System.out.println("Спим!");
            }
            if (hours >= 8 && hours < 12 && money > 10) {
                System.out.println("Идем в магазин");
            }
            if (hours >= 12 && hours < 19 && money > 50) {
                System.out.println("Идем в кафе");
            }
            if (hours > 12 && hours < 19 && money < 50) {
                System.out.println("Идем к соседу");
            }
            if (hours >= 19 && hours < 22) {
                System.out.println("Смотрим телевизор");
            }
            System.out.println();
        }

        start();
    }

    private void BeforeAfterCycle() {
        System.out.print("Введите начальное значения числа: ");
        short a = userChoice.nextShort();

        while (a >= 10) {
            do {
                System.out.print(a + " ");
                a--;
            }
            while (a > 10);
        }
        System.out.println();

        start();
    }

    private void AnotherClass() {
        System.out.print("Введите имя первого объекта: ");
        String obj1Name = userChoice.next();
        System.out.print("Введите имя второго объекта: ");
        String obj2Name = userChoice.next();

        TestClass obj1 = new TestClass(obj1Name);
        TestClass obj2 = new TestClass(obj2Name);

        System.out.print("Введите параметр для первого объекта (целое число): ");
        int instance1 = userChoice.nextInt();
        System.out.print("Введите параметр для второго объекта (целое число): ");
        int instance2 = userChoice.nextInt();

        obj1.setInstance(instance1);
        obj2.setInstance(instance2);

        System.out.println();
        start();
    }

    private void startDogs() {
        System.out.print("Введите имя первой собаки: ");
        String dogName = userChoice.next();
        TestDog dogFrst = new TestDog(dogName);
        System.out.print("Введите имя второй собаки: ");
        dogName = userChoice.next();
        Dog dogScnd = new Dog(dogName);

        System.out.print("Введите обычную высоту первой собаки: ");
        int higness = userChoice.nextInt();
        dogFrst.setHigh(higness);
        System.out.print("Введите обычную массу первой собаки: ");
        int massa = userChoice.nextInt();
        dogFrst.setMass(massa);
        System.out.print("Введите высоту для перегрузки первой собаки: ");
        short higness2 = userChoice.nextShort();
        dogFrst.setHigh(higness2);
        System.out.print("Введите массу для перегрузки первой собаки: ");
        short massa2 = userChoice.nextShort();
        dogFrst.setMass(massa2);
        dogFrst.Move();
        dogFrst.Eat();
        dogFrst.SuperMoove();
        System.out.println();

        System.out.print("Введите обычную высоту второй собаки: ");
        higness = userChoice.nextInt();
        dogScnd.setHigh(higness);
        System.out.print("Введите обычную массу второй собаки: ");
        massa = userChoice.nextInt();
        dogScnd.setMass(massa);
        dogScnd.Move();
        dogScnd.Eat();
        dogScnd.SuperMoove();

        System.out.println();
        Dog.StaticDogOut();
        start();
    }

    private void startCollection() {
        TestCollections.startMapCollections();
        System.out.println();
        TestCollections.startSetCollections();
        start();
    }

    private void startTryCatch() {
        double exTry = 0;
        Scanner tryIt = new Scanner(System.in);

        try {
            exTry = 1/0;
        } catch (ArithmeticException e) { System.out.println("Словили исключение: На ноль делить нельзя!");}
        if (exTry != 0) {System.out.println(exTry);}


        System.out.print("Введите какую-то строку: ");
        String str = tryIt.nextLine();
        str = null;
        try {
            if (str.equals("1")) {System.out.println("Ваша строка: " + str);}
        } catch (NullPointerException e) {System.out.println("Словили исключение: Ваша строка пустая!");}

        try {
            if (str.equals("1")) {System.out.println("Ваша строка: " + str);}
        } finally {
            System.out.println("Мы изменили вашу строку и словили исключение. Сообщение выведено через finally, так что сейчас будет ошибка!");
        }
        System.out.println();
        start();
    }

    private void ThreadMagic() {
        for (short i = 0; i < 10; i++) {
            TestParallelThreads thread = new TestParallelThreads("Thread" + i);
            thread.start();
        }


        for (short i = 0; i< 5; i++) {
            TestSynchThread thread = new TestSynchThread("SynchThread" + i);
            thread.start();
        }

        System.out.println();
    }
}