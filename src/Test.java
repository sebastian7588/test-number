public class Test {

    static double division(double a, double b) {
        return a / b;
    }

    static double modulo(double a, double b) {
        return a % b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        double a = 4.15;
        double b = 24.165;

        Test test = new Test();
        double divisionResult = test.division (a,b);
        double moduloResult = test.modulo (a,b);
        System.out.println("Division result: " + divisionResult + ", rest from division: " + moduloResult);

        double multiplicationResult = test.multiplication (a,b);
        System.out.println("Multiplication result: " + multiplicationResult);

    }
}