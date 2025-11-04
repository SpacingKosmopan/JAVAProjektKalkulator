package Calculator;

public class Calculations {
    public static float add(float... args) {
        float total = 0;
        for (float num : args) {
            total += num;
        }
        return total;
    }

    public static float subtract(float... args) {
        float total = args[0];
        for (float num : args) {
            if (num == args[0]) continue;
            total -= num;
        }
        return total;
    }

    public static float multiply(float... args) {
        float total = 1;
        for (float num : args) {
            total *= num;
        }
        return total;
    }

    public static float divide(float... args) {
        float total = args[0];
        for (float num : args) {
            if (num == args[0]) continue;
            if (num == 0) {
                System.out.println("Tried to divide by zero - skipped division");
                continue;
            }
            total /= num;
        }
        return total;
    }

    public static float expon(float base, int exponent) {
        float total = 1;
        for (int i = 0; i < exponent; i++) {
            base *= base;
        }
        return total;
    }

    public static float expon(float base) {
        return base * base;
    }

    public static float avg();
}