package geekbrains.lesson1homework;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculate(20, 30, 56, 156));
        System.out.println(task10and20(5, 6));
        System.out.println(isPositiveOrNegative(76));
        System.out.println(isNegative(-76));
        System.out.println(greetings("Александр"));


        byte a = -35;
        System.out.println(a);

        short b = 31344;
        System.out.println(b);

        int c = 555555;
        System.out.println(c);

        long d = 4574633235554445566L;
        System.out.println(d);

        float e = 546744.566756f;
        System.out.println(e);

        double f = -34366.2346;
        System.out.println(f);

        char g1 = '\u6474';
        char g2 = '\u4345';
        System.out.println(g1);
        System.out.println(g2);
//      g1 - Хакама - традиционные японские длинные широкие штаны в складку (Википедия)
//      g2 - Лев

        boolean h = false;
        System.out.println(h);


    }


    public static boolean calculate(int a, int b, int c, int d) {

        int e = a * (b + (c / d));
        System.out.println("e = " + e);
        return false;
    }

    public static boolean task10and20(int sum1, int sum2) {

        int t = sum1 + sum2;
        if (10 <= t && t <= 20) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
        return false;
    }

    public static boolean isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
        return false;
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static boolean greetings(String name) {
        System.out.println("Привет, " + name + "!");
        return false;
    }


}
