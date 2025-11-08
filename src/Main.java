import Calculator.Calculations;


public class Main {
    public static void main(String[] args) {
        System.out.println("Dodawanie: " + Calculations.add(3, 5, 1));
        System.out.println("Odejmowanie: " + Calculations.subtract(3, 5, 1));
        System.out.println("Mnożenie: " + Calculations.multiply(3, 5, 1));
        System.out.println("Dzielenie: " + Calculations.divide(3, 0, 3));
        System.out.println("Potęgowanie z dwoma argumentami: " + Calculations.expon(2, 3));
        System.out.println("Potęgowanie z jednym argumentem: " + Calculations.expon(2));
        System.out.println("Średnia: " + Calculations.average(3, 4, 5));
        System.out.println("Pierwiastek kwadratowy: " + Calculations.square_root(16));
        System.out.println("Wartość bezwzględna: " + Calculations.absolute(-10));
        System.out.println("Sinus z radianów: " + Calculations.r_sinus((float) Math.PI / 6));
        System.out.println("Sinus z kąta: " + Calculations.r_sinus(30));
        System.out.println("Cosinus z radianów: " + Calculations.a_cosinus((float) Math.PI / 3));
        System.out.println("Cosinus z kąta: " + Calculations.a_cosinus(120));
    }
}