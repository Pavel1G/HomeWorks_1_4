public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // Задача 1.
    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    //Задача 2.
    public static void task2() {
        int dayIsFriday = 3;

        for (; dayIsFriday <= 31; dayIsFriday += 7) {
            System.out.println("Сегодня пятница, " + dayIsFriday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("------------------------------------");
    }

    //Задача 3.
    public static void task3() {
        int futureYear = 2122;
        int pastYear = 1822;

        for (; pastYear <= futureYear; pastYear++) {
            if (pastYear % 79 == 0) {
                System.out.println(pastYear);
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    //Задача 4.
    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i + ":");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    //Задача 5.
    public static void task5() {
        int startValue = 0;
        int nextValue = 1;

        System.out.printf(startValue + " " + nextValue + " ");
        for (int i = 3; i <= 10; i++) {
            int thirdValue = startValue + nextValue;
            System.out.printf(thirdValue + " ");
            startValue = nextValue;
            nextValue = thirdValue;
        }

        System.out.println();
        System.out.println("------------------------------------");
    }
}
