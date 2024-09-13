import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));

        System.out.println("");

        System.out.println(fitCalc(15,1));
        System.out.println(fitCalc(24,2));
        System.out.println(fitCalc(41,3));

        System.out.println("");

        System.out.println(containers(3,4,2));
        System.out.println(containers(5,0,2));
        System.out.println(containers(4,1,4));

        System.out.println("");

        System.out.println(triangleType(5,5,5));
        System.out.println(triangleType(5,4,5));
        System.out.println(triangleType(3,4,5));
        System.out.println(triangleType(5,1,1));

        System.out.println("");

        System.out.println(ternaryEvaluation(8,4));
        System.out.println(ternaryEvaluation(1,11));
        System.out.println(ternaryEvaluation(5,9));

        System.out.println("");

        System.out.println(howManyItems(22,1.4,2));
        System.out.println(howManyItems(45,1.8,1.9));
        System.out.println(howManyItems(100,2,2));

        System.out.println("");

        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

        System.out.println("");

        System.out.println(gcd(48,18));
        System.out.println(gcd(52,8));
        System.out.println(gcd(259,28));

        System.out.println("");

        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));

        System.out.println("");

        System.out.println(tables(5,2));
        System.out.println(tables(31,20));
        System.out.println(tables(123,58));

    }

    public static double convert(int x) {
        double v = x * 3.785;
        return v;
    }

    public static int fitCalc(int duration, int intensity) {
        int fit;
        if (intensity > 0 && intensity<=3) {
            fit = duration*intensity;
            return fit;
        } else {
            System.out.println("Выбрана неверная интенсивность ( 0 < intensity <= 3 )");
            return 0;
        }
    }

    public static int containers(int box, int bag, int barrel) {
        int insideBox = box * 20;
        int insideBag = bag * 50;
        int insideBarrel = barrel * 100;
        int sum = insideBarrel + insideBox + insideBag;
        return sum;
    }

    public static String triangleType(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "not a triangle";
        }
        if (x == y && y == z) {
            return "isosceles";
        } else if (x == y || y == z || x == z) {
            return "equilateral";
        } else {
            return "different-sided";
        }
    }

    public static int ternaryEvaluation(int x, int y) {
        return (x > y) ? x : y;
    }

    public static int howManyItems(double n, double w, double h) {
        double fabricArea = n / 2;
        double detailArea = w * h;
        return (int) Math.floor(fabricArea / detailArea);
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int gcd(int x, int y) {
        while (x != 0) {
            int temp = x;
            x = y % x;
            y = temp;
        }
        return y;
    }

    public static double ticketSaler(int x, int y){
        double commission = 0.72;
        return x * y * commission;
    }

    public static int tables(int x, int y){
        int seats = y * 2;
        if (seats > x) {
            return 0;
        } else {
            return x - seats;
        }
    }
}

