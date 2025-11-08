package Calculator;

/**
 * Containts multiple useful mathematic functions
 */
public class Calculations {
    /**
     * Sums multiple numbers.
     *
     * @param args numbers to sum
     * @return sum of numbers
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.add(2,7);
     *     System.out.println(number); // 9.0
     * }</pre>
     */
    public static float add(float... args) {
        float total = 0;
        for (float num : args) {
            total += num;
        }
        return total;
    }

    /**
     * Subtracks numbers, starting from first.
     *
     * @param args numbers to subtract
     * @return difference of numbers
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.subtract(2,7,3);
     *     System.out.println(number); // -8.0
     * }</pre>
     */
    public static float subtract(float... args) {
        boolean firstIter = true;
        if (args.length == 0) {
            return 0;
        }
        float total = args[0];
        for (float num : args) {
            if (firstIter) {
                firstIter = false;
                continue;
            }
            total -= num;
        }
        return total;
    }

    /**
     * Multiplies numbers.
     *
     * @param args numbers to multiply
     * @return product of numbers
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.multiply(2,7,2);
     *     System.out.println(number); // 28.0
     * }</pre>
     */
    public static float multiply(float... args) {
        float total = 1;
        for (float num : args) {
            total *= num;
        }
        return total;
    }

    /**
     * Divides numbers, starting from first.
     *
     * @param args numbers to divide
     * @return quotient of numbers or <u>0</u> if at least on number is equal to 0
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.divide(8,2,2);
     *     System.out.println(number); // 2.0
     * }</pre>
     */
    public static float divide(float... args) {
        boolean firstIter = true;
        if (args.length == 0) return 0;
        float total = args[0];
        for (float num : args) {
            if (num == 0) return 0;
            if (firstIter) {
                firstIter = false;
                continue;
            }
            total /= num;
        }
        return total;
    }

    /**
     * Raises a number to the power of another number.
     *
     * @param base     the number to be raised
     * @param exponent exponent the power to raise the baise to
     * @return the result of base raised to the exponent
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.expon(8,2);
     *     System.out.println(number); // 64.0
     * }</pre>
     */
    public static float expon(float base, int exponent) {
        float total = 1;
        for (int i = 0; i < exponent; i++) {
            total *= base;
        }
        return total;
    }

    /**
     * Raises a number to the power of 2.
     *
     * @param base the number to be squared
     * @return base squared
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *      double result = Calculations.expon(3);
     *      System.out.println(result); // 9.0
     * }</pre>
     */
    public static float expon(float base) {
        return base * base;
    }

    /**
     * Calculates the arithmetic average of numbers.
     *
     * @param args numbers to average
     * @return arithmetic mean of the numbers
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *      double result = Calculations.average(4,5,6);
     *      System.out.println(result); // 5.0
     * }</pre>
     */
    public static float average(float... args) {
        if (args.length == 0) return 0;
        float total = 0;
        for (float num : args) {
            total += num;
        }
        total /= args.length;
        return total;
    }

    /**
     * Calculates the square root of a numbers.
     *
     * @param arg the number to calculate
     * @return square root of the number or <u>0</u> if the argument is negative
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     double number = Calculations.square_root(9);
     *     System.out.println(number); // 3.0
     * }</pre>
     */
    public static float square_root(float arg) {
        if (arg <= 0) return 0;
        return (float) Math.sqrt(arg);
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param arg the number to get the absolute value of
     * @return absolute value of the argument
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *     float number = Calculations.absolute(-9);
     *     System.out.println(number); // -3.0
     * }</pre>
     */
    public static float absolute(float arg) {
        if (arg <= 0) return arg *= -1;
        return arg;
    }

    /**
     * Calculates the sine of an angle in radians.
     *
     * @param arg angle in radians
     * @return sine of the angle
     *
     * <h6>Example</h6>
     * <pre>{@code
     *      float result = Calculations.r_sinus((float) Math.PI / 2);
     *      System.out.println(result); // 1.0
     * }</pre>
     */
    public static float r_sinus(float arg) {
        return (float) Math.sin(arg);
    }

    /**
     * Calculates the sine of an angle in degrees.
     *
     * @param arg angle in degrees
     * @return sine of the angle
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *      float result = Calculations.a_sinus(90);
     *      System.out.println(result); // 1.0
     * }</pre>
     */
    public static float a_sinus(float arg) {
        float radians = (float) Math.toRadians(arg);
        return r_sinus(radians);
    }

    /**
     * Calculates the cosine of an angle in radians.
     *
     * @param arg angle in radians
     * @return cosine of the angle
     *
     * <h6>Example</h6>
     * <pre>{@code
     *      float result = Calculations.r_cosine((float) Math.PI / 2);
     *      System.out.println(result); // 0.0
     * }</pre>
     */
    public static float r_cosinus(float arg) {
        return (float) Math.cos(arg);
    }

    /**
     * Calculates the cosine of an angle in degrees.
     *
     * @param arg angle in degrees
     * @return cosine of the angle
     *
     * <h6>Example:</h6>
     * <pre>{@code
     *      float result = Calculations.a_cosinus(90);
     *      System.out.println(result); // 0.0
     * }</pre>
     */
    public static float a_cosinus(float arg) {
        float radians = (float) Math.toRadians(arg);
        return r_cosinus(radians);
    }
}